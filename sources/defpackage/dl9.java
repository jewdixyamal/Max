package defpackage;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import androidx.appcompat.widget.AppCompatImageButton;
import androidx.appcompat.widget.AppCompatTextView;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import ru.ok.messages.media.mediabar.NumericCheckButton;

/* renamed from: dl9  reason: default package */
public final class dl9 extends v2 implements nse {
    public ImageView A0;
    public View B0;
    public final bk4 X = bk4.b();
    public ViewGroup Y;
    public FrameLayout Z;
    public final tg o;
    public AppCompatTextView s0;
    public ProgressBar t0;
    public AppCompatImageButton u0;
    public AppCompatImageButton v0;
    public ImageView w0;
    public ImageView x0;
    public NumericCheckButton y0;
    public FrameLayout z0;

    public dl9(Context context, ViewStub viewStub, tg tgVar) {
        super(context);
        this.o = tgVar;
        viewStub.setLayoutResource(yyb.cl_local_media_toolbox);
        this.c = viewStub.inflate();
        m();
    }

    public static void D(ImageView imageView, boolean z, sme sme) {
        if (z) {
            imageView.setBackground(hm9.S(Integer.valueOf(sme.k), (Integer) null, (Integer) null));
            imageView.setColorFilter(sme.l);
            return;
        }
        imageView.setBackground(sme.a());
        imageView.setColorFilter(sme.w);
    }

    public final void A(pq7 pq7) {
        B(this.s0, pq7.b);
        B(this.t0, pq7.c);
        FrameLayout frameLayout = this.Z;
        float f = pq7.a ? 1.0f : 0.35f;
        boolean z = pq7.X;
        C(frameLayout, z, f);
        FrameLayout frameLayout2 = this.z0;
        boolean z2 = pq7.o;
        B(frameLayout2, z2);
        B(this.A0, !z2);
        B(this.u0, z);
        boolean z3 = z && pq7.z0;
        B(this.v0, z3);
        if (z3) {
            this.v0.setSelected(pq7.y0);
        }
        B(this.w0, pq7.Z);
        B(this.x0, pq7.s0);
        this.s0.setText(pq7.t0.a);
        if (pq7.u0) {
            this.y0.setEnabled(true);
            this.y0.setNumber(pq7.v0);
            tu0.K(this.z0, 300, new yk9(this, 1));
        } else {
            tu0.K(this.z0, 300, new y20(5));
            this.y0.setNumber(0);
            this.y0.setEnabled(false);
        }
        khe khe = sme.a0;
        sme R = fm9.R((Context) this.b);
        D(this.w0, pq7.w0, R);
        D(this.x0, pq7.x0, R);
    }

    public final void B(View view, boolean z) {
        C(view, z, 1.0f);
    }

    public final void C(View view, boolean z, float f) {
        vof a = zmf.a(view);
        zk9 zk9 = new zk9(0, view, z);
        WeakReference weakReference = a.a;
        View view2 = (View) weakReference.get();
        if (view2 != null) {
            view2.animate().withStartAction(zk9);
        }
        if (!z) {
            f = 0.0f;
        }
        a.a(f);
        zk9 zk92 = new zk9(1, view, z);
        View view3 = (View) weakReference.get();
        if (view3 != null) {
            view3.animate().withEndAction(zk92);
        }
        a.c(this.o.a.b());
        View view4 = (View) weakReference.get();
        if (view4 != null) {
            view4.animate().start();
        }
    }

    public final void c() {
        if (((View) this.c) != null) {
            khe khe = sme.a0;
            Context context = (Context) this.b;
            sme R = fm9.R(context);
            this.Y.setBackgroundColor(R.m);
            this.B0.setBackgroundColor(R.K);
            AppCompatImageButton appCompatImageButton = this.u0;
            PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
            int i = R.w;
            appCompatImageButton.setColorFilter(i, mode);
            this.u0.setBackground(R.a());
            this.v0.setColorFilter(i, mode);
            this.v0.setBackground(R.a());
            this.s0.setTextColor(i);
            Integer valueOf = Integer.valueOf(i);
            bk4 bk4 = this.X;
            this.Z.setBackground(hm9.b0(0, valueOf, Integer.valueOf(bk4.b), bk4.d));
            aq4.g(this.t0.getIndeterminateDrawable(), i);
            aq4.g(this.w0.getDrawable(), i);
            aq4.g(this.x0.getDrawable(), i);
            this.w0.setBackground(R.a());
            this.x0.setBackground(R.a());
            aq4.g(this.A0.getDrawable(), R.k);
            this.A0.setBackground(R.a());
            Drawable mutate = kt3.b(context, gpc.o).mutate();
            aq4.g(mutate, i);
            this.y0.setUncheckedBackground(mutate);
        }
    }

    public final void m() {
        this.Y = (ViewGroup) ((View) this.c).findViewById(xxb.local_media_toolbox__content);
        FrameLayout frameLayout = (FrameLayout) ((View) this.c).findViewById(xxb.local_media_toolbox__quality_container);
        this.Z = frameLayout;
        frameLayout.setOnClickListener(new yk9(this, 0));
        this.s0 = (AppCompatTextView) ((View) this.c).findViewById(xxb.local_media_toolbox__quality_text);
        this.t0 = (ProgressBar) ((View) this.c).findViewById(xxb.local_media_toolbox__quality_progress);
        AppCompatImageButton appCompatImageButton = (AppCompatImageButton) ((View) this.c).findViewById(xxb.local_media_toolbox__trim_btn);
        this.u0 = appCompatImageButton;
        nd7.h(appCompatImageButton, new bl9(this, 0));
        AppCompatImageButton appCompatImageButton2 = (AppCompatImageButton) ((View) this.c).findViewById(xxb.local_media_toolbox__mute_btn);
        this.v0 = appCompatImageButton2;
        Drawable drawable = ((View) this.c).getResources().getDrawable(gpc.l0);
        Drawable drawable2 = ((View) this.c).getResources().getDrawable(gpc.j0);
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{16842913}, drawable2);
        stateListDrawable.addState(new int[0], drawable);
        appCompatImageButton2.setImageDrawable(stateListDrawable);
        nd7.h(this.v0, new bl9(this, 1));
        this.w0 = (ImageView) ((View) this.c).findViewById(xxb.local_media_toolbox__photo_crop_btn);
        this.x0 = (ImageView) ((View) this.c).findViewById(xxb.local_media_toolbox__photo_edit_btn);
        nd7.h(this.w0, new bl9(this, 2));
        nd7.h(this.x0, new bl9(this, 3));
        this.y0 = (NumericCheckButton) ((View) this.c).findViewById(xxb.local_media_toolbox__btn_select);
        this.z0 = (FrameLayout) ((View) this.c).findViewById(xxb.local_media_toolbox__fl_select);
        ImageView imageView = (ImageView) ((View) this.c).findViewById(xxb.local_media_toolbox__btn_apply);
        this.A0 = imageView;
        nd7.h(imageView, new bl9(this, 4));
        this.B0 = ((View) this.c).findViewById(xxb.local_media_toolbox__separator_bottom);
        c();
        ViewGroup viewGroup = this.Y;
        yt8 yt8 = new yt8(9, (Object) this);
        WeakHashMap weakHashMap = zmf.a;
        omf.u(viewGroup, yt8);
        mmf.c(this.Y);
    }
}
