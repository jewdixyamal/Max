package androidx.mediarouter.app;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.session.MediaControllerCompat;
import android.support.v4.media.session.PlaybackStateCompat;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.AlphaAnimation;
import android.view.animation.AnimationSet;
import android.view.animation.Interpolator;
import android.view.animation.TranslateAnimation;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.SeekBar;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

public final class d extends tc {
    public static final int z1 = ((int) TimeUnit.SECONDS.toMillis(30));
    public MediaRouteExpandCollapseButton A0;
    public FrameLayout B0;
    public LinearLayout C0;
    public FrameLayout D0;
    public ImageView E0;
    public TextView F0;
    public TextView G0;
    public TextView H0;
    public final boolean I0 = true;
    public final boolean J0;
    public LinearLayout K0;
    public RelativeLayout L0;
    public LinearLayout M0;
    public View N0;
    public OverlayListView O0;
    public c P0;
    public ArrayList Q0;
    public HashSet R0;
    public HashSet S0;
    public HashSet T0;
    public SeekBar U0;
    public vr0 V0;
    public dh8 W0;
    public int X0;
    public int Y0;
    public final eh8 Z;
    public int Z0;
    public final int a1;
    public HashMap b1;
    public MediaControllerCompat c1;
    public final yf8 d1;
    public PlaybackStateCompat e1;
    public MediaDescriptionCompat f1;
    public xf8 g1;
    public Bitmap h1;
    public Uri i1;
    public boolean j1;
    public Bitmap k1;
    public int l1;
    public boolean m1;
    public boolean n1;
    public boolean o1;
    public boolean p1;
    public boolean q1;
    public int r1;
    public final mf8 s0;
    public int s1;
    public final dh8 t0;
    public int t1;
    public final Context u0;
    public Interpolator u1;
    public boolean v0;
    public final Interpolator v1;
    public int w0;
    public final Interpolator w1;
    public Button x0;
    public final AccessibilityManager x1;
    public Button y0;
    public final q57 y1 = new q57(9, this);
    public ImageButton z0;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public d(android.content.Context r4) {
        /*
            r3 = this;
            r0 = 1
            android.view.ContextThemeWrapper r4 = defpackage.lh8.a(r4, r0)
            int r1 = defpackage.lh8.b(r4)
            r3.<init>(r4, r1)
            r3.I0 = r0
            q57 r1 = new q57
            r2 = 9
            r1.<init>(r2, r3)
            r3.y1 = r1
            android.content.Context r1 = r3.getContext()
            r3.u0 = r1
            yf8 r2 = new yf8
            r2.<init>(r3)
            r3.d1 = r2
            eh8 r2 = defpackage.eh8.d(r1)
            r3.Z = r2
            ah8 r2 = defpackage.eh8.d
            if (r2 != 0) goto L_0x0030
            r0 = 0
            goto L_0x0037
        L_0x0030:
            ah8 r2 = defpackage.eh8.c()
            r2.getClass()
        L_0x0037:
            r3.J0 = r0
            mf8 r0 = new mf8
            r2 = 2
            r0.<init>(r3, r2)
            r3.s0 = r0
            defpackage.eh8.b()
            ah8 r0 = defpackage.eh8.c()
            dh8 r0 = r0.f()
            r3.t0 = r0
            r3.p()
            android.content.res.Resources r0 = r1.getResources()
            int r2 = defpackage.qtb.mr_controller_volume_group_list_padding_top
            int r0 = r0.getDimensionPixelSize(r2)
            r3.a1 = r0
            java.lang.String r0 = "accessibility"
            java.lang.Object r0 = r1.getSystemService(r0)
            android.view.accessibility.AccessibilityManager r0 = (android.view.accessibility.AccessibilityManager) r0
            r3.x1 = r0
            int r0 = defpackage.myb.mr_linear_out_slow_in
            android.view.animation.Interpolator r0 = android.view.animation.AnimationUtils.loadInterpolator(r4, r0)
            r3.v1 = r0
            int r0 = defpackage.myb.mr_fast_out_slow_in
            android.view.animation.Interpolator r4 = android.view.animation.AnimationUtils.loadInterpolator(r4, r0)
            r3.w1 = r4
            android.view.animation.AccelerateDecelerateInterpolator r3 = new android.view.animation.AccelerateDecelerateInterpolator
            r3.<init>()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.mediarouter.app.d.<init>(android.content.Context):void");
    }

    public static void o(View view, int i) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.height = i;
        view.setLayoutParams(layoutParams);
    }

    public final void h(View view, int i) {
        vf8 vf8 = new vf8(view, view.getLayoutParams().height, i, 0);
        vf8.setDuration((long) this.r1);
        vf8.setInterpolator(this.u1);
        view.startAnimation(vf8);
    }

    public final boolean i() {
        return (this.f1 == null && this.e1 == null) ? false : true;
    }

    public final void j(boolean z) {
        HashSet hashSet;
        int firstVisiblePosition = this.O0.getFirstVisiblePosition();
        for (int i = 0; i < this.O0.getChildCount(); i++) {
            View childAt = this.O0.getChildAt(i);
            dh8 dh8 = (dh8) this.P0.getItem(firstVisiblePosition + i);
            if (!z || (hashSet = this.R0) == null || !hashSet.contains(dh8)) {
                ((LinearLayout) childAt.findViewById(dvb.volume_item_container)).setVisibility(0);
                AnimationSet animationSet = new AnimationSet(true);
                AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 1.0f);
                alphaAnimation.setDuration(0);
                animationSet.addAnimation(alphaAnimation);
                new TranslateAnimation(0.0f, 0.0f, 0.0f, 0.0f).setDuration(0);
                animationSet.setFillAfter(true);
                animationSet.setFillEnabled(true);
                childAt.clearAnimation();
                childAt.startAnimation(animationSet);
            }
        }
        Iterator it = this.O0.a.iterator();
        while (it.hasNext()) {
            coa coa = (coa) it.next();
            coa.k = true;
            coa.l = true;
            h7b h7b = coa.m;
            if (h7b != null) {
                d dVar = (d) h7b.c;
                dVar.T0.remove((dh8) h7b.b);
                dVar.P0.notifyDataSetChanged();
            }
        }
        if (!z) {
            k(false);
        }
    }

    public final void k(boolean z) {
        this.R0 = null;
        this.S0 = null;
        this.p1 = false;
        if (this.q1) {
            this.q1 = false;
            t(z);
        }
        this.O0.setEnabled(true);
    }

    public final int l(int i, int i2) {
        float f;
        float f2;
        if (i >= i2) {
            f = ((float) this.w0) * ((float) i2);
            f2 = (float) i;
        } else {
            f = ((float) this.w0) * 9.0f;
            f2 = 16.0f;
        }
        return (int) ((f / f2) + 0.5f);
    }

    public final int m(boolean z) {
        if (!z && this.M0.getVisibility() != 0) {
            return 0;
        }
        int paddingBottom = this.K0.getPaddingBottom() + this.K0.getPaddingTop();
        if (z) {
            paddingBottom += this.L0.getMeasuredHeight();
        }
        int measuredHeight = this.M0.getVisibility() == 0 ? this.M0.getMeasuredHeight() + paddingBottom : paddingBottom;
        return (!z || this.M0.getVisibility() != 0) ? measuredHeight : this.N0.getMeasuredHeight() + measuredHeight;
    }

    public final boolean n() {
        dh8 dh8 = this.t0;
        return dh8.e() && Collections.unmodifiableList(dh8.u).size() > 1;
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.Z.a(wg8.c, this.s0, 2);
        boolean z = eh8.c;
        p();
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [android.view.View$OnClickListener, java.lang.Object] */
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getWindow().setBackgroundDrawableResource(17170445);
        setContentView(syb.mr_controller_material_dialog_b);
        findViewById(16908315).setVisibility(8);
        wf8 wf8 = new wf8(this);
        FrameLayout frameLayout = (FrameLayout) findViewById(dvb.mr_expandable_area);
        this.B0 = frameLayout;
        frameLayout.setOnClickListener(new sf8(this, 0));
        LinearLayout linearLayout = (LinearLayout) findViewById(dvb.mr_dialog_area);
        this.C0 = linearLayout;
        linearLayout.setOnClickListener(new Object());
        int i = vsb.colorPrimary;
        Context context = this.u0;
        int g = lh8.g(context, i);
        if (s63.d(g, lh8.g(context, 16842801)) < 3.0d) {
            g = lh8.g(context, vsb.colorAccent);
        }
        Button button = (Button) findViewById(16908314);
        this.x0 = button;
        button.setText(n1c.mr_controller_disconnect);
        this.x0.setTextColor(g);
        this.x0.setOnClickListener(wf8);
        Button button2 = (Button) findViewById(16908313);
        this.y0 = button2;
        button2.setText(n1c.mr_controller_stop_casting);
        this.y0.setTextColor(g);
        this.y0.setOnClickListener(wf8);
        this.H0 = (TextView) findViewById(dvb.mr_name);
        ((ImageButton) findViewById(dvb.mr_close)).setOnClickListener(wf8);
        FrameLayout frameLayout2 = (FrameLayout) findViewById(dvb.mr_custom_control);
        this.D0 = (FrameLayout) findViewById(dvb.mr_default_control);
        sf8 sf8 = new sf8(this, 1);
        ImageView imageView = (ImageView) findViewById(dvb.mr_art);
        this.E0 = imageView;
        imageView.setOnClickListener(sf8);
        findViewById(dvb.mr_control_title_container).setOnClickListener(sf8);
        this.K0 = (LinearLayout) findViewById(dvb.mr_media_main_control);
        this.N0 = findViewById(dvb.mr_control_divider);
        this.L0 = (RelativeLayout) findViewById(dvb.mr_playback_control);
        this.F0 = (TextView) findViewById(dvb.mr_control_title);
        this.G0 = (TextView) findViewById(dvb.mr_control_subtitle);
        ImageButton imageButton = (ImageButton) findViewById(dvb.mr_control_playback_ctrl);
        this.z0 = imageButton;
        imageButton.setOnClickListener(wf8);
        LinearLayout linearLayout2 = (LinearLayout) findViewById(dvb.mr_volume_control);
        this.M0 = linearLayout2;
        linearLayout2.setVisibility(8);
        SeekBar seekBar = (SeekBar) findViewById(dvb.mr_volume_slider);
        this.U0 = seekBar;
        dh8 dh8 = this.t0;
        seekBar.setTag(dh8);
        vr0 vr0 = new vr0(this);
        this.V0 = vr0;
        this.U0.setOnSeekBarChangeListener(vr0);
        this.O0 = (OverlayListView) findViewById(dvb.mr_volume_group_list);
        this.Q0 = new ArrayList();
        c cVar = new c(this, this.O0.getContext(), this.Q0);
        this.P0 = cVar;
        this.O0.setAdapter(cVar);
        this.T0 = new HashSet();
        LinearLayout linearLayout3 = this.K0;
        OverlayListView overlayListView = this.O0;
        boolean n = n();
        int g2 = lh8.g(context, vsb.colorPrimary);
        int g3 = lh8.g(context, vsb.colorPrimaryDark);
        if (n && lh8.c(context) == -570425344) {
            g3 = g2;
            g2 = -1;
        }
        linearLayout3.setBackgroundColor(g2);
        overlayListView.setBackgroundColor(g3);
        linearLayout3.setTag(Integer.valueOf(g2));
        overlayListView.setTag(Integer.valueOf(g3));
        MediaRouteVolumeSlider mediaRouteVolumeSlider = (MediaRouteVolumeSlider) this.U0;
        LinearLayout linearLayout4 = this.K0;
        int c = lh8.c(context);
        if (Color.alpha(c) != 255) {
            c = s63.g(c, ((Integer) linearLayout4.getTag()).intValue());
        }
        mediaRouteVolumeSlider.a(c, c);
        HashMap hashMap = new HashMap();
        this.b1 = hashMap;
        hashMap.put(dh8, this.U0);
        MediaRouteExpandCollapseButton mediaRouteExpandCollapseButton = (MediaRouteExpandCollapseButton) findViewById(dvb.mr_group_expand_collapse);
        this.A0 = mediaRouteExpandCollapseButton;
        mediaRouteExpandCollapseButton.w0 = new sf8(this, 2);
        this.u1 = this.o1 ? this.v1 : this.w1;
        this.r1 = context.getResources().getInteger(iyb.mr_controller_volume_group_list_animation_duration_ms);
        this.s1 = context.getResources().getInteger(iyb.mr_controller_volume_group_list_fade_in_duration_ms);
        this.t1 = context.getResources().getInteger(iyb.mr_controller_volume_group_list_fade_out_duration_ms);
        this.v0 = true;
        s();
    }

    public final void onDetachedFromWindow() {
        this.Z.f(this.s0);
        p();
        super.onDetachedFromWindow();
    }

    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i != 25 && i != 24) {
            return super.onKeyDown(i, keyEvent);
        }
        if (this.J0 || !this.o1) {
            this.t0.k(i == 25 ? -1 : 1);
        }
        return true;
    }

    public final boolean onKeyUp(int i, KeyEvent keyEvent) {
        if (i == 25 || i == 24) {
            return true;
        }
        return super.onKeyUp(i, keyEvent);
    }

    public final void p() {
        MediaControllerCompat mediaControllerCompat = this.c1;
        yf8 yf8 = this.d1;
        if (mediaControllerCompat != null) {
            mediaControllerCompat.unregisterCallback(yf8);
            this.c1 = null;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:46:0x00ab  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x0144  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x0146  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x014e  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x0150  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x0158  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void q(boolean r13) {
        /*
            r12 = this;
            dh8 r0 = r12.W0
            r1 = 1
            if (r0 == 0) goto L_0x000d
            r12.m1 = r1
            boolean r0 = r12.n1
            r13 = r13 | r0
            r12.n1 = r13
            return
        L_0x000d:
            r0 = 0
            r12.m1 = r0
            r12.n1 = r0
            dh8 r2 = r12.t0
            boolean r3 = r2.g()
            if (r3 == 0) goto L_0x01d8
            boolean r3 = r2.d()
            if (r3 == 0) goto L_0x0022
            goto L_0x01d8
        L_0x0022:
            boolean r3 = r12.v0
            if (r3 != 0) goto L_0x0027
            return
        L_0x0027:
            android.widget.TextView r3 = r12.H0
            java.lang.String r4 = r2.d
            r3.setText(r4)
            android.widget.Button r3 = r12.x0
            boolean r4 = r2.i
            r5 = 8
            if (r4 == 0) goto L_0x0038
            r4 = r0
            goto L_0x0039
        L_0x0038:
            r4 = r5
        L_0x0039:
            r3.setVisibility(r4)
            boolean r3 = r12.j1
            r4 = 0
            if (r3 == 0) goto L_0x0065
            android.graphics.Bitmap r3 = r12.k1
            if (r3 == 0) goto L_0x0051
            boolean r3 = r3.isRecycled()
            if (r3 == 0) goto L_0x0051
            android.graphics.Bitmap r3 = r12.k1
            java.util.Objects.toString(r3)
            goto L_0x005f
        L_0x0051:
            android.widget.ImageView r3 = r12.E0
            android.graphics.Bitmap r6 = r12.k1
            r3.setImageBitmap(r6)
            android.widget.ImageView r3 = r12.E0
            int r6 = r12.l1
            r3.setBackgroundColor(r6)
        L_0x005f:
            r12.j1 = r0
            r12.k1 = r4
            r12.l1 = r0
        L_0x0065:
            boolean r3 = r12.J0
            if (r3 != 0) goto L_0x008a
            boolean r6 = r12.n()
            if (r6 == 0) goto L_0x008a
            android.widget.LinearLayout r3 = r12.M0
            r3.setVisibility(r5)
            r12.o1 = r1
            androidx.mediarouter.app.OverlayListView r3 = r12.O0
            r3.setVisibility(r0)
            boolean r3 = r12.o1
            if (r3 == 0) goto L_0x0082
            android.view.animation.Interpolator r3 = r12.v1
            goto L_0x0084
        L_0x0082:
            android.view.animation.Interpolator r3 = r12.w1
        L_0x0084:
            r12.u1 = r3
            r12.t(r0)
            goto L_0x00da
        L_0x008a:
            boolean r6 = r12.o1
            if (r6 == 0) goto L_0x0090
            if (r3 == 0) goto L_0x00d5
        L_0x0090:
            boolean r3 = r12.I0
            if (r3 == 0) goto L_0x00d5
            boolean r3 = r2.e()
            if (r3 == 0) goto L_0x00a7
            ah8 r3 = defpackage.eh8.d
            if (r3 != 0) goto L_0x00a0
            r3 = r0
            goto L_0x00a9
        L_0x00a0:
            ah8 r3 = defpackage.eh8.c()
            r3.getClass()
        L_0x00a7:
            int r3 = r2.n
        L_0x00a9:
            if (r3 != r1) goto L_0x00d5
            android.widget.LinearLayout r3 = r12.M0
            int r3 = r3.getVisibility()
            if (r3 != r5) goto L_0x00da
            android.widget.LinearLayout r3 = r12.M0
            r3.setVisibility(r0)
            android.widget.SeekBar r3 = r12.U0
            int r6 = r2.p
            r3.setMax(r6)
            android.widget.SeekBar r3 = r12.U0
            int r6 = r2.o
            r3.setProgress(r6)
            androidx.mediarouter.app.MediaRouteExpandCollapseButton r3 = r12.A0
            boolean r6 = r12.n()
            if (r6 == 0) goto L_0x00d0
            r6 = r0
            goto L_0x00d1
        L_0x00d0:
            r6 = r5
        L_0x00d1:
            r3.setVisibility(r6)
            goto L_0x00da
        L_0x00d5:
            android.widget.LinearLayout r3 = r12.M0
            r3.setVisibility(r5)
        L_0x00da:
            boolean r3 = r12.i()
            if (r3 == 0) goto L_0x01d4
            android.support.v4.media.MediaDescriptionCompat r3 = r12.f1
            if (r3 != 0) goto L_0x00e6
            r3 = r4
            goto L_0x00ea
        L_0x00e6:
            java.lang.CharSequence r3 = r3.getTitle()
        L_0x00ea:
            boolean r6 = android.text.TextUtils.isEmpty(r3)
            r6 = r6 ^ r1
            android.support.v4.media.MediaDescriptionCompat r7 = r12.f1
            if (r7 != 0) goto L_0x00f4
            goto L_0x00f8
        L_0x00f4:
            java.lang.CharSequence r4 = r7.getSubtitle()
        L_0x00f8:
            boolean r7 = android.text.TextUtils.isEmpty(r4)
            r7 = r7 ^ r1
            int r2 = r2.q
            r8 = -1
            if (r2 == r8) goto L_0x010c
            android.widget.TextView r2 = r12.F0
            int r3 = defpackage.n1c.mr_controller_casting_screen
            r2.setText(r3)
        L_0x0109:
            r3 = r0
            r2 = r1
            goto L_0x0140
        L_0x010c:
            android.support.v4.media.session.PlaybackStateCompat r2 = r12.e1
            if (r2 == 0) goto L_0x0138
            int r2 = r2.getState()
            if (r2 != 0) goto L_0x0117
            goto L_0x0138
        L_0x0117:
            if (r6 != 0) goto L_0x0123
            if (r7 != 0) goto L_0x0123
            android.widget.TextView r2 = r12.F0
            int r3 = defpackage.n1c.mr_controller_no_info_available
            r2.setText(r3)
            goto L_0x0109
        L_0x0123:
            if (r6 == 0) goto L_0x012c
            android.widget.TextView r2 = r12.F0
            r2.setText(r3)
            r2 = r1
            goto L_0x012d
        L_0x012c:
            r2 = r0
        L_0x012d:
            if (r7 == 0) goto L_0x0136
            android.widget.TextView r3 = r12.G0
            r3.setText(r4)
            r3 = r1
            goto L_0x0140
        L_0x0136:
            r3 = r0
            goto L_0x0140
        L_0x0138:
            android.widget.TextView r2 = r12.F0
            int r3 = defpackage.n1c.mr_controller_no_media_selected
            r2.setText(r3)
            goto L_0x0109
        L_0x0140:
            android.widget.TextView r4 = r12.F0
            if (r2 == 0) goto L_0x0146
            r2 = r0
            goto L_0x0147
        L_0x0146:
            r2 = r5
        L_0x0147:
            r4.setVisibility(r2)
            android.widget.TextView r2 = r12.G0
            if (r3 == 0) goto L_0x0150
            r3 = r0
            goto L_0x0151
        L_0x0150:
            r3 = r5
        L_0x0151:
            r2.setVisibility(r3)
            android.support.v4.media.session.PlaybackStateCompat r2 = r12.e1
            if (r2 == 0) goto L_0x01d4
            int r2 = r2.getState()
            r3 = 6
            if (r2 == r3) goto L_0x016b
            android.support.v4.media.session.PlaybackStateCompat r2 = r12.e1
            int r2 = r2.getState()
            r3 = 3
            if (r2 != r3) goto L_0x0169
            goto L_0x016b
        L_0x0169:
            r2 = r0
            goto L_0x016c
        L_0x016b:
            r2 = r1
        L_0x016c:
            android.widget.ImageButton r3 = r12.z0
            android.content.Context r3 = r3.getContext()
            r6 = 0
            if (r2 == 0) goto L_0x0188
            android.support.v4.media.session.PlaybackStateCompat r4 = r12.e1
            long r8 = r4.getActions()
            r10 = 514(0x202, double:2.54E-321)
            long r8 = r8 & r10
            int r4 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r4 == 0) goto L_0x0188
            int r2 = defpackage.qsb.mediaRoutePauseDrawable
            int r4 = defpackage.n1c.mr_controller_pause
            goto L_0x01b3
        L_0x0188:
            if (r2 == 0) goto L_0x019c
            android.support.v4.media.session.PlaybackStateCompat r4 = r12.e1
            long r8 = r4.getActions()
            r10 = 1
            long r8 = r8 & r10
            int r4 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r4 == 0) goto L_0x019c
            int r2 = defpackage.qsb.mediaRouteStopDrawable
            int r4 = defpackage.n1c.mr_controller_stop
            goto L_0x01b3
        L_0x019c:
            if (r2 != 0) goto L_0x01b0
            android.support.v4.media.session.PlaybackStateCompat r2 = r12.e1
            long r8 = r2.getActions()
            r10 = 516(0x204, double:2.55E-321)
            long r8 = r8 & r10
            int r2 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r2 == 0) goto L_0x01b0
            int r2 = defpackage.qsb.mediaRoutePlayDrawable
            int r4 = defpackage.n1c.mr_controller_play
            goto L_0x01b3
        L_0x01b0:
            r1 = r0
            r2 = r1
            r4 = r2
        L_0x01b3:
            android.widget.ImageButton r6 = r12.z0
            if (r1 == 0) goto L_0x01b8
            goto L_0x01b9
        L_0x01b8:
            r0 = r5
        L_0x01b9:
            r6.setVisibility(r0)
            if (r1 == 0) goto L_0x01d4
            android.widget.ImageButton r0 = r12.z0
            int r1 = defpackage.lh8.h(r3, r2)
            r0.setImageResource(r1)
            android.widget.ImageButton r0 = r12.z0
            android.content.res.Resources r1 = r3.getResources()
            java.lang.CharSequence r1 = r1.getText(r4)
            r0.setContentDescription(r1)
        L_0x01d4:
            r12.t(r13)
            return
        L_0x01d8:
            r12.dismiss()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.mediarouter.app.d.q(boolean):void");
    }

    public final void r() {
        MediaDescriptionCompat mediaDescriptionCompat = this.f1;
        Uri uri = null;
        Bitmap iconBitmap = mediaDescriptionCompat == null ? null : mediaDescriptionCompat.getIconBitmap();
        MediaDescriptionCompat mediaDescriptionCompat2 = this.f1;
        if (mediaDescriptionCompat2 != null) {
            uri = mediaDescriptionCompat2.getIconUri();
        }
        xf8 xf8 = this.g1;
        Bitmap bitmap = xf8 == null ? this.h1 : xf8.a;
        Uri uri2 = xf8 == null ? this.i1 : xf8.b;
        if (bitmap == iconBitmap) {
            if (bitmap != null) {
                return;
            }
            if (uri2 != null && uri2.equals(uri)) {
                return;
            }
            if (uri2 == null && uri == null) {
                return;
            }
        }
        if (!n() || this.J0) {
            xf8 xf82 = this.g1;
            if (xf82 != null) {
                xf82.cancel(true);
            }
            xf8 xf83 = new xf8(this);
            this.g1 = xf83;
            xf83.execute(new Void[0]);
        }
    }

    public final void s() {
        Context context = this.u0;
        int v = dy7.v(context);
        getWindow().setLayout(v, -2);
        View decorView = getWindow().getDecorView();
        this.w0 = (v - decorView.getPaddingLeft()) - decorView.getPaddingRight();
        Resources resources = context.getResources();
        this.X0 = resources.getDimensionPixelSize(qtb.mr_controller_volume_group_list_item_icon_size);
        this.Y0 = resources.getDimensionPixelSize(qtb.mr_controller_volume_group_list_item_height);
        this.Z0 = resources.getDimensionPixelSize(qtb.mr_controller_volume_group_list_max_height);
        this.h1 = null;
        this.i1 = null;
        r();
        q(false);
    }

    public final void t(boolean z) {
        this.D0.requestLayout();
        this.D0.getViewTreeObserver().addOnGlobalLayoutListener(new uf8(this, z));
    }

    public final void u(boolean z) {
        int i = 0;
        this.N0.setVisibility((this.M0.getVisibility() != 0 || !z) ? 8 : 0);
        LinearLayout linearLayout = this.K0;
        if (this.M0.getVisibility() == 8 && !z) {
            i = 8;
        }
        linearLayout.setVisibility(i);
    }
}
