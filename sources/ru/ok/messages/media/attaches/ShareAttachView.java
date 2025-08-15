package ru.ok.messages.media.attaches;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.facebook.drawee.view.SimpleDraweeView;

public class ShareAttachView extends FrameLayout implements ps8, View.OnClickListener {
    public final bk4 a;
    public final LinearLayout b;
    public final FrameLayout c;
    public final ShareAttachHeaderView o;
    public final View s0;
    public final View t0;
    public final ShareAttachHeaderView u0;
    public final ShareAttachBigImageView v0;
    public final ShareAttachBigImageBgView w0;
    public final ShareMediaView x0;
    public final sme y0;
    public boolean z0 = true;

    /* JADX WARNING: type inference failed for: r7v14, types: [ru.ok.messages.media.attaches.ShareAttachBigImageBgView, com.facebook.drawee.view.SimpleDraweeView] */
    /* JADX WARNING: type inference failed for: r7v16, types: [com.facebook.drawee.view.SimpleDraweeView, ru.ok.messages.media.attaches.ShareAttachBigImageView, android.view.View, uq4] */
    /* JADX WARNING: type inference failed for: r7v20, types: [ts8, android.view.View, ru.ok.messages.media.attaches.ShareMediaView] */
    public ShareAttachView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        getContext();
        this.a = bk4.b();
        Context context2 = getContext();
        khe khe = sme.a0;
        this.y0 = fm9.R(context2);
        LinearLayout linearLayout = new LinearLayout(getContext());
        this.b = linearLayout;
        linearLayout.setOrientation(1);
        addView(this.b, new FrameLayout.LayoutParams(this.z0 ? -1 : -2, -2));
        ShareAttachHeaderView shareAttachHeaderView = new ShareAttachHeaderView(getContext());
        this.o = shareAttachHeaderView;
        bk4 bk4 = this.a;
        int i = bk4.h;
        shareAttachHeaderView.setPadding(i, i, i, bk4.f);
        this.b.addView(this.o, new LinearLayout.LayoutParams(this.z0 ? -1 : -2, -2));
        View view = new View(getContext());
        this.s0 = view;
        view.setBackgroundColor(this.y0.p);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, this.a.a);
        layoutParams.setMarginStart(this.a.h);
        layoutParams.setMarginEnd(this.a.h);
        this.b.addView(this.s0, layoutParams);
        ShareAttachHeaderView shareAttachHeaderView2 = new ShareAttachHeaderView(getContext());
        this.u0 = shareAttachHeaderView2;
        int i2 = this.a.h;
        shareAttachHeaderView2.setPadding(i2, i2, i2, 0);
        this.b.addView(this.u0, new LinearLayout.LayoutParams(this.z0 ? -1 : -2, -2));
        this.c = new FrameLayout(getContext());
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams2.topMargin = this.a.f;
        this.b.addView(this.c, layoutParams2);
        ? simpleDraweeView = new SimpleDraweeView(getContext());
        ed3 b2 = vl.b();
        int i3 = tp0.f;
        b2.a(25, 1);
        ((y8a) b2).d();
        this.w0 = simpleDraweeView;
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams3.gravity = 17;
        this.c.addView(this.w0, layoutParams3);
        ? simpleDraweeView2 = new SimpleDraweeView(getContext());
        ed3 b3 = vl.b();
        simpleDraweeView2.getContext();
        bk4.b();
        ((y8a) b3).d();
        this.v0 = simpleDraweeView2;
        ((la6) simpleDraweeView2.getHierarchy()).h(ssc.l);
        FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams(-1, -1);
        layoutParams4.gravity = 17;
        this.c.addView(this.v0, layoutParams4);
        ? ts8 = new ts8(getContext());
        ts8.getContext();
        bk4.b();
        int i4 = (int) 9.0f;
        ts8.Y0 = (float) fk4.b(i4);
        this.x0 = ts8;
        ts8.setId(xxb.view_share_attach__media);
        FrameLayout.LayoutParams layoutParams5 = new FrameLayout.LayoutParams(-1, -2);
        layoutParams5.gravity = 17;
        this.c.addView(this.x0, layoutParams5);
        View view2 = new View(getContext());
        this.t0 = view2;
        view2.setBackgroundColor(this.y0.p);
        this.c.addView(this.t0, new FrameLayout.LayoutParams(-1, this.a.a));
        setClickable(true);
        this.a.getClass();
        this.a.getClass();
        wnc a2 = wnc.a(0.0f, 0.0f, (float) fk4.b(i4), (float) fk4.b(i4));
        a2.h = true;
        ((la6) this.w0.getHierarchy()).n(a2);
        this.w0.setOnClickListener(this);
        this.x0.setAttachClickListener(this);
    }

    public ts8 getMediaView() {
        return this.x0;
    }

    public final void onClick(View view) {
        this.x0.getVisibility();
        callOnClick();
    }

    public final void onMeasure(int i, int i2) {
        View.MeasureSpec.getSize(i);
        throw null;
    }

    public void setEmbeddedPlayer(boolean z) {
        this.x0.setEmbeddedPlayer(z);
    }

    public void setMatchHeaderWidthToParentWidth(boolean z) {
        if (this.z0 != z) {
            this.z0 = z;
            int i = -1;
            this.b.setLayoutParams(new FrameLayout.LayoutParams(z ? -1 : -2, -2));
            this.u0.setLayoutParams(new LinearLayout.LayoutParams(z ? -1 : -2, -2));
            ShareAttachHeaderView shareAttachHeaderView = this.o;
            if (!z) {
                i = -2;
            }
            shareAttachHeaderView.setLayoutParams(new LinearLayout.LayoutParams(i, -2));
        }
    }

    public void setMediaClickListener(ujd ujd) {
    }

    public void setPipRequestListener(ss8 ss8) {
        this.x0.setPipRequestListener(ss8);
    }
}
