package com.ian.app

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.ian.app.helper.SecretKeyHelper.baseUrl
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Example of a call to a native method
        sample_text.text = baseUrl
    }

    /**
     * A native method that is implemented by the 'native-lib' native library,
     * which is packaged with this application.
     * But in this case, it already customized and implement it using "ian" library.
     */
    companion object {

        // Used to load the 'native-lib' library on application startup.
        init {
            System.loadLibrary("ian")
        }
    }
}
