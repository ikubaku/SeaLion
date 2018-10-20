package net.ikbk.sealion

import android.app.AlertDialog
import android.app.DialogFragment
import android.content.DialogInterface
import android.os.Bundle

class CreateEntryDialogFragment : DialogFragment() {
    override fun onCreateDialog(savedInstanceState: Bundle?): AlertDialog? {
        val builder = AlertDialog.Builder(activity)
        builder.setMessage("Hello, world!")
                .setPositiveButton("Heck yeah", DialogInterface.OnClickListener {
                    dialog, id ->
                    // Do something
                })
                .setNegativeButton("Nope", DialogInterface.OnClickListener {
                    dialog, id ->
                    // Do anything
                })
        return builder.create()
    }
}