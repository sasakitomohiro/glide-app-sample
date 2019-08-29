package monster.sasakisan.glide_app_sample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import monster.sasakisan.glide_app_sample.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private val binding by lazy {
        DataBindingUtil.setContentView<ActivityMainBinding>(this, R.layout.activity_main)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        GlideApp
            .with(this)
            .load(R.drawable.ic_launcher_foreground)
            .into(binding.imageView)
    }
}
