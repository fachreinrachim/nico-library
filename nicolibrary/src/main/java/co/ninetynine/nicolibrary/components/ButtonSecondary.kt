package co.ninetynine.nicolibrary.components

import android.content.Context
import android.os.Build
import android.widget.Button
import androidx.core.content.ContextCompat
import co.ninetynine.nicolibrary.R

/**
 * @author M.Fachrein Rachim <fachreinrachim@gmail.com>
 * @since 2020-01-23.
 */
class ButtonSecondary(context: Context?) : Button(context) {

    init {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN) {
            super.setBackground(ContextCompat.getDrawable(context!!, R.drawable.bg_button_secondary))
        }
    }
}