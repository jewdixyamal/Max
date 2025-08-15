package ru.ok.messages.media.audio;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;

public class AudioRecordView extends ConstraintLayout implements kre {
    public static final /* synthetic */ int O0 = 0;
    public final TextView G0 = ((TextView) findViewById(xxb.view_audio_record__tv_duration));
    public final TextView H0 = ((TextView) findViewById(xxb.view_audio_record__tv_swipe_cancel));
    public final TextView I0;
    public final ImageView J0 = ((ImageView) findViewById(xxb.frg_chat__iv_icon));
    public final View K0;
    public final View L0;
    public final ImageView M0;
    public final View N0;

    public AudioRecordView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        c54.c(this);
        c54.K(this);
        getContext();
        ((y8a) vl.b()).c();
        LayoutInflater.from(getContext()).inflate(yyb.view_audio_record, this, true);
        TextView textView = (TextView) findViewById(xxb.view_audio_record__tv_click_cancel);
        this.I0 = textView;
        findViewById(xxb.view_audio_record__duration_panel);
        View findViewById = findViewById(xxb.view_audio_record__static_circle);
        this.K0 = findViewById;
        this.L0 = findViewById(xxb.view_audio_record__audio_circle);
        View findViewById2 = findViewById(xxb.view_audio_record__slide_panel);
        ImageView imageView = (ImageView) findViewById(xxb.view_audio_record__im_arrow);
        this.M0 = imageView;
        Drawable drawable = imageView.getDrawable();
        if (drawable != null) {
            drawable.setAutoMirrored(true);
        }
        this.N0 = findViewById(xxb.view_audio_record__root_panel);
        nd7.h(findViewById2, new e5(1, this));
        nd7.h(findViewById, new e5(1, this));
        nd7.h(textView, new e5(1, this));
        onThemeChanged(qp4.u0.j(this));
    }

    private int getStaticCircleSize() {
        int width = this.K0.getWidth();
        return width == 0 ? getResources().getDimensionPixelSize(jtb.audio_record_static_circle_size) : width;
    }

    public final void onThemeChanged(fka fka) {
        i9g h = qp4.u0.j(this).a().h();
        kqe kqe = i4f.l;
        TextView textView = this.G0;
        kqe.b(textView, du4.b);
        textView.setTextColor(fka.getText().e);
        this.J0.setColorFilter(fka.getIcon().b);
        this.K0.setBackground(hm9.S(Integer.valueOf(fka.f().c), (Integer) null, (Integer) null));
        x3 f = fka.f();
        khe khe = sme.a0;
        this.L0.setBackground(hm9.S(Integer.valueOf(ote.b0(f.c, 0.2f)), (Integer) null, (Integer) null));
        ngg.G(this.M0.getDrawable(), fka.getText().g);
        kqe kqe2 = i4f.p;
        TextView textView2 = this.H0;
        kqe2.b(textView2, du4.b);
        textView2.setTextColor(fka.getText().g);
        TextView textView3 = this.I0;
        kqe2.b(textView3, du4.b);
        textView3.setTextColor(fka.getText().b);
        this.N0.setBackgroundColor(h.a.d);
    }

    public void setListener(p60 p60) {
    }
}
