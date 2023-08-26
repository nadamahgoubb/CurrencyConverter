package com.nada.currencyconverter.presentation.fragments.home

  import androidx.fragment.app.viewModels
  import com.nada.currencyconverter.base.BaseFragment
  import com.nada.currencyconverter.common.hideKeyboard
  import com.nada.currencyconverter.common.observe
  import com.nada.currencyconverter.databinding.FragmentHomeBinding
  import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class HomeFragment : BaseFragment<FragmentHomeBinding>() {
    private val mViewModel: HomeViewModel by viewModels()

    override fun onFragmentReady() {
        mViewModel.apply {
            observe(viewState) {
                handleViewState(it)
            }
        }

    }

    private fun handleViewState(action: HomeAction) {
        when (action) {
            is HomeAction.ShowLoading -> {
                 showProgress(action.show)
                if (action.show) {
                    hideKeyboard()
                }
            }


            is HomeAction.ShowFailureMsg -> action.message?.let {
                showProgress(false)
                showToast(action.message)
            }

            else -> {

            }
        }
    }



}