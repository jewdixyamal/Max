package com.google.android.material.timepicker;

import android.content.Context;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.button.MaterialButtonToggleGroup;
import com.google.android.material.chip.Chip;

class TimePickerView extends ConstraintLayout {
    public static final /* synthetic */ int H0 = 0;
    public final Chip G0;

    public TimePickerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        e eVar = new e(this);
        LayoutInflater.from(context).inflate(vyb.material_timepicker, this);
        ClockFaceView clockFaceView = (ClockFaceView) findViewById(ivb.material_clock_face);
        ((MaterialButtonToggleGroup) findViewById(ivb.material_clock_period_toggle)).c.add(new d(this));
        Chip chip = (Chip) findViewById(ivb.material_minute_tv);
        Chip chip2 = (Chip) findViewById(ivb.material_hour_tv);
        this.G0 = chip2;
        ClockHandView clockHandView = (ClockHandView) findViewById(ivb.material_clock_hand);
        yb5 yb5 = new yb5(2, new GestureDetector(getContext(), new f(this)));
        chip.setOnTouchListener(yb5);
        chip2.setOnTouchListener(yb5);
        chip.setTag(ivb.selection_type, 12);
        chip2.setTag(ivb.selection_type, 10);
        chip.setOnClickListener(eVar);
        chip2.setOnClickListener(eVar);
        chip.setAccessibilityClassName("android.view.View");
        chip2.setAccessibilityClassName("android.view.View");
    }

    public final void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        if (view == this && i == 0) {
            this.G0.sendAccessibilityEvent(8);
        }
    }
}
