package org.mifospay.history.specific_transactions.ui

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import dagger.hilt.android.AndroidEntryPoint
import org.mifospay.base.BaseActivity
import org.mifospay.common.Constants
import org.mifospay.feature.receipt.ReceiptActivity
import org.mifospay.history.specific_transactions.presenter.SpecificTransactionsViewModel
import org.mifospay.theme.MifosTheme

@AndroidEntryPoint
class SpecificTransactionsActivity : BaseActivity() {

    private val viewModel: SpecificTransactionsViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewModel.setArguments(
            transactions = intent.getParcelableArrayListExtra(Constants.TRANSACTIONS)
                ?: arrayListOf(),
            accountNumber = intent.getStringExtra(Constants.ACCOUNT_NUMBER) ?: ""
        )
        setContent {
            MifosTheme {
                SpecificTransactionsScreen(
                    backPress = { onBackPressed() },
                    transactionItemClicked = { transactionId ->
                        navigateToReceiptActivity(transactionId)
                    }
                )
            }
        }
    }

    private fun navigateToReceiptActivity(transactionId: String) {
        val intent = Intent(this@SpecificTransactionsActivity, ReceiptActivity::class.java)
        intent.data = Uri.parse(Constants.RECEIPT_DOMAIN + transactionId)
        startActivity(intent)
    }
}