package de.spacekookie.aquawear

import android.app.Activity
import android.os.Bundle
import de.spacekookie.aquawear.databinding.ActivityWearBinding

class WearActivity : Activity() {

    private lateinit var binding: ActivityWearBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityWearBinding.inflate(layoutInflater)
        setContentView(binding.root)

    }
}