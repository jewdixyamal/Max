package ru.ok.messages.messages.widgets;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;

public class ChatMsgSearchResultView extends ConstraintLayout implements kre {
    public static final /* synthetic */ int L0 = 0;
    public final TextView G0 = ((TextView) findViewById(xxb.chat_msg_search_result_view__result));
    public final ImageView H0;
    public final ImageView I0;
    public final ProgressBar J0;
    public final View K0;

    public ChatMsgSearchResultView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        View.inflate(context, yyb.chat_msg_search_result_view, this);
        ImageView imageView = (ImageView) findViewById(xxb.chat_msg_search_result_view__next);
        this.H0 = imageView;
        tu0.K(imageView, 100, new c5(16, (Object) this));
        ImageView imageView2 = (ImageView) findViewById(xxb.chat_msg_search_result_view__prev);
        this.I0 = imageView2;
        tu0.K(imageView2, 100, new c5(16, (Object) this));
        this.J0 = (ProgressBar) findViewById(xxb.chat_msg_search_result_view__pb_loading);
        this.K0 = findViewById(xxb.chat_msg_search_result_view_next_prev_separator);
        c();
    }

    public final void c() {
        pq9 pq9 = qp4.u0;
        fka j = pq9.j(this);
        setBackgroundColor(j.a().h().a.d);
        ImageView imageView = this.H0;
        boolean isEnabled = imageView.isEnabled();
        boolean z = !isEnabled;
        fka j2 = pq9.j(this);
        imageView.setColorFilter(z ? j2.d().b.a.f : j2.getIcon().f);
        imageView.setEnabled(isEnabled);
        imageView.setVisibility(0);
        ImageView imageView2 = this.I0;
        boolean isEnabled2 = imageView2.isEnabled();
        boolean z2 = !isEnabled2;
        fka j3 = pq9.j(this);
        imageView2.setColorFilter(z2 ? j3.d().b.a.f : j3.getIcon().f);
        imageView2.setEnabled(isEnabled2);
        imageView2.setVisibility(0);
        ngg.H(this.J0, j.f().c);
        kqe kqe = i4f.l;
        du4 du4 = du4.b;
        TextView textView = this.G0;
        kqe.b(textView, du4);
        textView.setTextColor(j.getText().h);
        this.K0.setBackgroundColor(j.getIcon().h);
    }

    public final void onThemeChanged(fka fka) {
        c();
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return true;
    }
}
