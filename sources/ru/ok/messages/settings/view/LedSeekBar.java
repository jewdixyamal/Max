package ru.ok.messages.settings.view;

import android.content.Context;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.util.AttributeSet;
import android.widget.SeekBar;
import ru.ok.messages.settings.FrgBaseSettings;

public class LedSeekBar extends pn implements SeekBar.OnSeekBarChangeListener {
    public final int b;
    public ve7 c;
    public final int[] o = ((y8a) vl.b()).n().c.w();
    public final ShapeDrawable s0;

    public LedSeekBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        getContext();
        bk4 b2 = bk4.b();
        int i = b2.n;
        this.b = b2.b;
        int dimension = (int) getResources().getDimension(fpc.d);
        setPadding(dimension, 0, dimension, 0);
        setProgressDrawable(new g6(this));
        ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
        this.s0 = shapeDrawable;
        shapeDrawable.setBounds(0, 0, i, i);
        this.s0.setIntrinsicHeight(i);
        this.s0.setIntrinsicWidth(i);
        setThumb(this.s0);
        setThumbOffset(i / 2);
        setOnSeekBarChangeListener(this);
    }

    public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        int[] iArr = this.o;
        int length = (int) ((((float) iArr.length) / ((float) getMax())) * ((float) i));
        if (length > iArr.length - 1) {
            length = iArr.length - 1;
        }
        this.s0.getPaint().setColor(this.o[length]);
    }

    public final void onStartTrackingTouch(SeekBar seekBar) {
    }

    public final void onStopTrackingTouch(SeekBar seekBar) {
        int progress = getProgress();
        int[] iArr = this.o;
        int length = (int) ((((float) iArr.length) / ((float) getMax())) * ((float) progress));
        if (length > iArr.length - 1) {
            length = iArr.length - 1;
        }
        float max = ((float) getMax()) / ((float) this.o.length);
        setProgress((int) ((max / 2.0f) + (((float) length) * max)));
        ve7 ve7 = this.c;
        if (ve7 != null) {
            int i = this.o[length];
            d74 d74 = (d74) ve7;
            we7 we7 = (we7) d74.b;
            FrgBaseSettings frgBaseSettings = (FrgBaseSettings) d74.c;
            if (frgBaseSettings != null) {
                frgBaseSettings.u1(we7.L0.a, Integer.valueOf(i));
            } else {
                we7.getClass();
            }
        }
    }

    public void setColor(int i) {
        int i2 = 0;
        int i3 = 0;
        while (true) {
            int[] iArr = this.o;
            if (i3 >= iArr.length) {
                break;
            } else if (i == iArr[i3]) {
                i2 = i3;
                break;
            } else {
                i3++;
            }
        }
        float max = ((float) getMax()) / ((float) this.o.length);
        setProgress((int) ((max / 2.0f) + (((float) i2) * max)));
    }

    public void setListener(ve7 ve7) {
        this.c = ve7;
    }
}
