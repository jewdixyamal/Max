package ru.ok.messages.media.attaches;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.facebook.drawee.view.SimpleDraweeView;

public class ShareAttachHeaderView extends ConstraintLayout {
    public bk4 G0;
    public int H0;
    public int I0;
    public AppCompatTextView J0;
    public AppCompatTextView K0;
    public AppCompatTextView L0;
    public SimpleDraweeView M0;
    public sme N0;

    public ShareAttachHeaderView(Context context) {
        super(context);
        w();
    }

    public final void onMeasure(int i, int i2) {
        boolean z = this.M0.getVisibility() == 0;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i) - (z ? this.H0 - (this.I0 * 2) : 0), 1073741824);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
        this.L0.measure(makeMeasureSpec, makeMeasureSpec2);
        this.J0.measure(makeMeasureSpec, makeMeasureSpec2);
        if (z) {
            int measuredHeight = this.J0.getMeasuredHeight() + this.L0.getMeasuredHeight();
            if (measuredHeight < this.H0) {
                this.M0.getLayoutParams().width = measuredHeight;
                this.M0.getLayoutParams().height = measuredHeight;
            } else {
                this.M0.getLayoutParams().width = this.H0;
                this.M0.getLayoutParams().height = this.H0;
            }
        }
        super.onMeasure(i, i2);
    }

    public void setImageVisibility(int i) {
        this.M0.setVisibility(i);
    }

    public final void w() {
        ed3 b = vl.b();
        getContext();
        this.G0 = bk4.b();
        ((y8a) b).d();
        bk4 bk4 = this.G0;
        this.H0 = bk4.y;
        this.I0 = bk4.h;
        Context context = getContext();
        khe khe = sme.a0;
        this.N0 = fm9.R(context);
        SimpleDraweeView simpleDraweeView = new SimpleDraweeView(getContext());
        this.M0 = simpleDraweeView;
        simpleDraweeView.setId(xxb.view_share_attach__iv_small_image);
        ((la6) this.M0.getHierarchy()).h(ssc.l);
        float f = (float) this.G0.d;
        wnc a = wnc.a(f, f, f, f);
        a.h = true;
        ((la6) this.M0.getHierarchy()).n(a);
        j47.q(this.M0, this.I0);
        int i = this.G0.y;
        ti3 ti3 = new ti3(this.I0 + i, i);
        ti3.X = true;
        ti3.W = true;
        addView(this.M0, ti3);
        AppCompatTextView appCompatTextView = new AppCompatTextView(getContext(), (AttributeSet) null);
        this.L0 = appCompatTextView;
        appCompatTextView.setId(xxb.view_share_attach__tv_host);
        this.L0.setIncludeFontPadding(false);
        this.L0.setMaxLines(1);
        this.L0.setTextColor(this.N0.v);
        this.L0.setTextSize(0, this.G0.H);
        AppCompatTextView appCompatTextView2 = this.L0;
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        appCompatTextView2.setEllipsize(truncateAt);
        this.L0.setGravity(8388611);
        this.L0.setTextAlignment(5);
        ti3 ti32 = new ti3(-2, -2);
        ti32.W = true;
        ti32.X = true;
        ti32.E = 0.0f;
        addView(this.L0, ti32);
        AppCompatTextView appCompatTextView3 = new AppCompatTextView(getContext(), (AttributeSet) null);
        this.J0 = appCompatTextView3;
        appCompatTextView3.setId(xxb.view_share_attach__tv_title);
        this.J0.setIncludeFontPadding(false);
        this.J0.setMaxLines(2);
        this.J0.setTextSize(0, this.G0.I);
        this.J0.setTypeface(Typeface.DEFAULT_BOLD);
        this.J0.setEllipsize(truncateAt);
        this.J0.setGravity(8388611);
        this.J0.setTextAlignment(5);
        ti3 ti33 = new ti3(-2, -2);
        ti33.W = true;
        ti33.X = true;
        ti33.E = 0.0f;
        addView(this.J0, ti33);
        AppCompatTextView appCompatTextView4 = new AppCompatTextView(getContext(), (AttributeSet) null);
        this.K0 = appCompatTextView4;
        appCompatTextView4.setId(xxb.view_share_attach__tv_description);
        this.K0.setMaxLines(3);
        this.K0.setTextColor(this.N0.v);
        this.K0.setTextSize(0, this.G0.I);
        this.K0.setEllipsize(truncateAt);
        this.K0.setGravity(8388611);
        this.K0.setTextAlignment(5);
        ti3 ti34 = new ti3(-2, -2);
        ti34.W = true;
        ti34.X = true;
        ti34.E = 0.0f;
        addView(this.K0, ti34);
        dj3 dj3 = new dj3();
        dj3.c(this);
        dj3.d(this.M0.getId(), 3, 0, 3);
        dj3.d(this.M0.getId(), 7, 0, 7);
        dj3.g(this.M0.getId()).d.y = "1:1";
        dj3.d(this.L0.getId(), 6, 0, 6);
        dj3.d(this.L0.getId(), 3, 0, 3);
        dj3.d(this.L0.getId(), 7, this.M0.getId(), 6);
        dj3.d(this.J0.getId(), 6, 0, 6);
        dj3.d(this.J0.getId(), 3, this.L0.getId(), 4);
        dj3.d(this.J0.getId(), 7, this.M0.getId(), 6);
        zi3 zi3 = dj3.g(xxb.view_share_attach_header__vertical_barrier).d;
        zi3.h0 = 1;
        zi3.f0 = 3;
        zi3.g0 = 0;
        zi3.a = false;
        zi3.i0 = new int[]{this.M0.getId(), this.L0.getId(), this.J0.getId()};
        dj3.d(this.K0.getId(), 6, 0, 6);
        dj3.d(this.K0.getId(), 3, xxb.view_share_attach_header__vertical_barrier, 3);
        dj3.d(this.K0.getId(), 7, 0, 7);
        dj3.d(this.K0.getId(), 4, 0, 4);
        dj3.a(this);
    }

    public ShareAttachHeaderView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        w();
    }
}
