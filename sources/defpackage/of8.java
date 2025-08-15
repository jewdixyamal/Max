package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.IntentFilter;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.os.AsyncTask;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.View;
import androidx.fragment.app.b;
import androidx.fragment.app.c;
import androidx.mediarouter.app.MediaRouteChooserDialogFragment;
import androidx.mediarouter.app.MediaRouteControllerDialogFragment;
import java.util.ArrayList;
import java.util.List;

/* renamed from: of8  reason: default package */
public final class of8 extends View {
    public static lf8 E0;
    public static final SparseArray F0 = new SparseArray(2);
    public static final int[] G0 = {16842912};
    public static final int[] H0 = {16842911};
    public final int A0;
    public final int B0;
    public boolean C0;
    public boolean D0;
    public final eh8 a;
    public final mf8 b;
    public wg8 c;
    public ag8 o;
    public boolean s0;
    public int t0;
    public nf8 u0;
    public Drawable v0;
    public int w0;
    public int x0;
    public int y0;
    public final ColorStateList z0;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public of8(android.content.Context r10) {
        /*
            r9 = this;
            r0 = 0
            int r6 = defpackage.qsb.mediaRouteButtonStyle
            int r1 = defpackage.lh8.a
            android.view.ContextThemeWrapper r1 = new android.view.ContextThemeWrapper
            int r2 = defpackage.lh8.f(r10)
            r1.<init>(r10, r2)
            int r10 = defpackage.qsb.mediaRouteTheme
            int r10 = defpackage.lh8.h(r1, r10)
            if (r10 == 0) goto L_0x001c
            android.view.ContextThemeWrapper r2 = new android.view.ContextThemeWrapper
            r2.<init>(r1, r10)
            r1 = r2
        L_0x001c:
            r4 = 0
            r9.<init>(r1, r4, r6)
            wg8 r10 = defpackage.wg8.c
            r9.c = r10
            ag8 r10 = defpackage.ag8.a
            r9.o = r10
            r9.t0 = r0
            android.content.Context r10 = r9.getContext()
            int[] r1 = defpackage.o3c.MediaRouteButton
            android.content.res.TypedArray r8 = r10.obtainStyledAttributes(r4, r1, r6, r0)
            int[] r3 = defpackage.o3c.MediaRouteButton
            java.util.WeakHashMap r1 = defpackage.zmf.a
            r7 = 0
            r1 = r9
            r2 = r10
            r5 = r8
            defpackage.umf.d(r1, r2, r3, r4, r5, r6, r7)
            boolean r1 = r9.isInEditMode()
            if (r1 == 0) goto L_0x0058
            r1 = 0
            r9.a = r1
            r9.b = r1
            int r1 = defpackage.o3c.MediaRouteButton_externalRouteEnabledDrawableStatic
            int r0 = r8.getResourceId(r1, r0)
            android.graphics.drawable.Drawable r10 = defpackage.s36.n(r10, r0)
            r9.v0 = r10
            goto L_0x00ff
        L_0x0058:
            eh8 r1 = defpackage.eh8.d(r10)
            r9.a = r1
            mf8 r1 = new mf8
            r1.<init>(r9, r0)
            r9.b = r1
            defpackage.eh8.b()
            ah8 r1 = defpackage.eh8.c()
            dh8 r1 = r1.f()
            boolean r2 = r1.d()
            r3 = 1
            r2 = r2 ^ r3
            if (r2 == 0) goto L_0x007b
            int r1 = r1.h
            goto L_0x007c
        L_0x007b:
            r1 = r0
        L_0x007c:
            r9.y0 = r1
            r9.x0 = r1
            lf8 r1 = E0
            if (r1 != 0) goto L_0x008f
            lf8 r1 = new lf8
            android.content.Context r10 = r10.getApplicationContext()
            r1.<init>(r10)
            E0 = r1
        L_0x008f:
            int r10 = defpackage.o3c.MediaRouteButton_mediaRouteButtonTint
            android.content.res.ColorStateList r10 = r8.getColorStateList(r10)
            r9.z0 = r10
            int r10 = defpackage.o3c.MediaRouteButton_android_minWidth
            int r10 = r8.getDimensionPixelSize(r10, r0)
            r9.A0 = r10
            int r10 = defpackage.o3c.MediaRouteButton_android_minHeight
            int r10 = r8.getDimensionPixelSize(r10, r0)
            r9.B0 = r10
            int r10 = defpackage.o3c.MediaRouteButton_externalRouteEnabledDrawableStatic
            int r10 = r8.getResourceId(r10, r0)
            int r1 = defpackage.o3c.MediaRouteButton_externalRouteEnabledDrawable
            int r1 = r8.getResourceId(r1, r0)
            r9.w0 = r1
            r8.recycle()
            int r1 = r9.w0
            android.util.SparseArray r2 = F0
            if (r1 == 0) goto L_0x00cd
            java.lang.Object r1 = r2.get(r1)
            android.graphics.drawable.Drawable$ConstantState r1 = (android.graphics.drawable.Drawable.ConstantState) r1
            if (r1 == 0) goto L_0x00cd
            android.graphics.drawable.Drawable r1 = r1.newDrawable()
            r9.setRemoteIndicatorDrawable(r1)
        L_0x00cd:
            android.graphics.drawable.Drawable r1 = r9.v0
            if (r1 != 0) goto L_0x00f9
            if (r10 == 0) goto L_0x00f6
            java.lang.Object r1 = r2.get(r10)
            android.graphics.drawable.Drawable$ConstantState r1 = (android.graphics.drawable.Drawable.ConstantState) r1
            if (r1 == 0) goto L_0x00e3
            android.graphics.drawable.Drawable r10 = r1.newDrawable()
            r9.setRemoteIndicatorDrawableInternal(r10)
            goto L_0x00f9
        L_0x00e3:
            nf8 r1 = new nf8
            android.content.Context r2 = r9.getContext()
            r1.<init>(r9, r10, r2)
            r9.u0 = r1
            java.util.concurrent.Executor r10 = android.os.AsyncTask.SERIAL_EXECUTOR
            java.lang.Void[] r0 = new java.lang.Void[r0]
            r1.executeOnExecutor(r10, r0)
            goto L_0x00f9
        L_0x00f6:
            r9.a()
        L_0x00f9:
            r9.e()
            r9.setClickable(r3)
        L_0x00ff:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.of8.<init>(android.content.Context):void");
    }

    private Activity getActivity() {
        for (Context context = getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof Activity) {
                return (Activity) context;
            }
        }
        return null;
    }

    private c getFragmentManager() {
        Activity activity = getActivity();
        if (activity instanceof b) {
            return ((b) activity).S();
        }
        return null;
    }

    public final void a() {
        if (this.w0 > 0) {
            nf8 nf8 = this.u0;
            if (nf8 != null) {
                nf8.cancel(false);
            }
            nf8 nf82 = new nf8(this, this.w0, getContext());
            this.u0 = nf82;
            this.w0 = 0;
            nf82.executeOnExecutor(AsyncTask.SERIAL_EXECUTOR, new Void[0]);
        }
    }

    public final void b() {
        this.a.getClass();
        eh8.b();
        dh8 f = eh8.c().f();
        boolean z = true;
        boolean z2 = !f.d();
        int i = z2 ? f.h : 0;
        if (this.y0 != i) {
            this.y0 = i;
            e();
            refreshDrawableState();
        }
        if (i == 1) {
            a();
        }
        if (this.s0) {
            if (!this.C0 && !z2 && !eh8.e(this.c)) {
                z = false;
            }
            setEnabled(z);
        }
    }

    public final void c() {
        int i = this.t0;
        if (i == 0 && !this.C0 && !E0.b) {
            i = 4;
        }
        super.setVisibility(i);
        Drawable drawable = this.v0;
        if (drawable != null) {
            drawable.setVisible(getVisibility() == 0, false);
        }
    }

    public final boolean d() {
        if (!this.s0) {
            return false;
        }
        eh8 eh8 = this.a;
        eh8.getClass();
        eh8.b();
        eh8.c();
        c fragmentManager = getFragmentManager();
        if (fragmentManager != null) {
            eh8.getClass();
            eh8.b();
            if (eh8.c().f().d()) {
                if (fragmentManager.E("android.support.v7.mediarouter:MediaRouteChooserDialogFragment") != null) {
                    return false;
                }
                this.o.getClass();
                MediaRouteChooserDialogFragment mediaRouteChooserDialogFragment = new MediaRouteChooserDialogFragment();
                wg8 wg8 = this.c;
                if (wg8 != null) {
                    mediaRouteChooserDialogFragment.l1();
                    if (!mediaRouteChooserDialogFragment.D1.equals(wg8)) {
                        mediaRouteChooserDialogFragment.D1 = wg8;
                        Bundle bundle = mediaRouteChooserDialogFragment.Z;
                        if (bundle == null) {
                            bundle = new Bundle();
                        }
                        bundle.putBundle("selector", wg8.a);
                        mediaRouteChooserDialogFragment.X0(bundle);
                        fn fnVar = mediaRouteChooserDialogFragment.C1;
                        if (fnVar != null) {
                            if (mediaRouteChooserDialogFragment.B1) {
                                ((gg8) fnVar).h(wg8);
                            } else {
                                ((qf8) fnVar).h(wg8);
                            }
                        }
                    }
                    he0 he0 = new he0(fragmentManager);
                    he0.f(0, mediaRouteChooserDialogFragment, "android.support.v7.mediarouter:MediaRouteChooserDialogFragment", 1);
                    he0.d(true);
                } else {
                    throw new IllegalArgumentException("selector must not be null");
                }
            } else if (fragmentManager.E("android.support.v7.mediarouter:MediaRouteControllerDialogFragment") != null) {
                return false;
            } else {
                this.o.getClass();
                MediaRouteControllerDialogFragment mediaRouteControllerDialogFragment = new MediaRouteControllerDialogFragment();
                wg8 wg82 = this.c;
                if (wg82 != null) {
                    if (mediaRouteControllerDialogFragment.D1 == null) {
                        Bundle bundle2 = mediaRouteControllerDialogFragment.Z;
                        if (bundle2 != null) {
                            Bundle bundle3 = bundle2.getBundle("selector");
                            wg8 wg83 = null;
                            if (bundle3 != null) {
                                wg83 = new wg8((List) null, bundle3);
                            } else {
                                wg8 wg84 = wg8.c;
                            }
                            mediaRouteControllerDialogFragment.D1 = wg83;
                        }
                        if (mediaRouteControllerDialogFragment.D1 == null) {
                            mediaRouteControllerDialogFragment.D1 = wg8.c;
                        }
                    }
                    if (!mediaRouteControllerDialogFragment.D1.equals(wg82)) {
                        mediaRouteControllerDialogFragment.D1 = wg82;
                        Bundle bundle4 = mediaRouteControllerDialogFragment.Z;
                        if (bundle4 == null) {
                            bundle4 = new Bundle();
                        }
                        bundle4.putBundle("selector", wg82.a);
                        mediaRouteControllerDialogFragment.X0(bundle4);
                        fn fnVar2 = mediaRouteControllerDialogFragment.C1;
                        if (fnVar2 != null && mediaRouteControllerDialogFragment.B1) {
                            ((pg8) fnVar2).j(wg82);
                        }
                    }
                    he0 he02 = new he0(fragmentManager);
                    he02.f(0, mediaRouteControllerDialogFragment, "android.support.v7.mediarouter:MediaRouteControllerDialogFragment", 1);
                    he02.d(true);
                } else {
                    throw new IllegalArgumentException("selector must not be null");
                }
            }
            return true;
        }
        throw new IllegalStateException("The activity must be a subclass of FragmentActivity");
    }

    public final void drawableStateChanged() {
        super.drawableStateChanged();
        if (this.v0 != null) {
            this.v0.setState(getDrawableState());
            if (this.v0.getCurrent() instanceof AnimationDrawable) {
                AnimationDrawable animationDrawable = (AnimationDrawable) this.v0.getCurrent();
                int i = this.y0;
                if (i == 1 || this.x0 != i) {
                    if (!animationDrawable.isRunning()) {
                        animationDrawable.start();
                    }
                } else if (i == 2 && !animationDrawable.isRunning()) {
                    animationDrawable.selectDrawable(animationDrawable.getNumberOfFrames() - 1);
                }
            }
            invalidate();
        }
        this.x0 = this.y0;
    }

    public final void e() {
        int i = this.y0;
        String string = getContext().getString(i != 1 ? i != 2 ? n1c.mr_cast_button_disconnected : n1c.mr_cast_button_connected : n1c.mr_cast_button_connecting);
        setContentDescription(string);
        if (!this.D0 || TextUtils.isEmpty(string)) {
            string = null;
        }
        swe.a(this, string);
    }

    public ag8 getDialogFactory() {
        return this.o;
    }

    public wg8 getRouteSelector() {
        return this.c;
    }

    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.v0;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (!isInEditMode()) {
            this.s0 = true;
            if (!this.c.c()) {
                this.a.a(this.c, this.b, 0);
            }
            b();
            lf8 lf8 = E0;
            ArrayList arrayList = lf8.c;
            if (arrayList.size() == 0) {
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
                lf8.a.registerReceiver(lf8, intentFilter);
            }
            arrayList.add(this);
        }
    }

    public final int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 1);
        if (this.a == null) {
            return onCreateDrawableState;
        }
        int i2 = this.y0;
        if (i2 == 1) {
            View.mergeDrawableStates(onCreateDrawableState, H0);
        } else if (i2 == 2) {
            View.mergeDrawableStates(onCreateDrawableState, G0);
        }
        return onCreateDrawableState;
    }

    public final void onDetachedFromWindow() {
        if (!isInEditMode()) {
            this.s0 = false;
            if (!this.c.c()) {
                this.a.f(this.b);
            }
            lf8 lf8 = E0;
            ArrayList arrayList = lf8.c;
            arrayList.remove(this);
            if (arrayList.size() == 0) {
                lf8.a.unregisterReceiver(lf8);
            }
        }
        super.onDetachedFromWindow();
    }

    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.v0 != null) {
            int paddingLeft = getPaddingLeft();
            int width = getWidth() - getPaddingRight();
            int paddingTop = getPaddingTop();
            int height = getHeight() - getPaddingBottom();
            int intrinsicWidth = this.v0.getIntrinsicWidth();
            int intrinsicHeight = this.v0.getIntrinsicHeight();
            int i = (((width - paddingLeft) - intrinsicWidth) / 2) + paddingLeft;
            int i2 = (((height - paddingTop) - intrinsicHeight) / 2) + paddingTop;
            this.v0.setBounds(i, i2, intrinsicWidth + i, intrinsicHeight + i2);
            this.v0.draw(canvas);
        }
    }

    public final void onMeasure(int i, int i2) {
        int i3;
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        Drawable drawable = this.v0;
        int i4 = 0;
        if (drawable != null) {
            i3 = getPaddingRight() + getPaddingLeft() + drawable.getIntrinsicWidth();
        } else {
            i3 = 0;
        }
        int max = Math.max(this.A0, i3);
        Drawable drawable2 = this.v0;
        if (drawable2 != null) {
            i4 = getPaddingBottom() + getPaddingTop() + drawable2.getIntrinsicHeight();
        }
        int max2 = Math.max(this.B0, i4);
        if (mode == Integer.MIN_VALUE) {
            size = Math.min(size, max);
        } else if (mode != 1073741824) {
            size = max;
        }
        if (mode2 == Integer.MIN_VALUE) {
            size2 = Math.min(size2, max2);
        } else if (mode2 != 1073741824) {
            size2 = max2;
        }
        setMeasuredDimension(size, size2);
    }

    public final boolean performClick() {
        boolean performClick = super.performClick();
        if (!performClick) {
            playSoundEffect(0);
        }
        a();
        if (this.s0) {
            this.a.getClass();
            eh8.b();
            eh8.c();
            c fragmentManager = getFragmentManager();
            if (fragmentManager != null) {
                eh8.b();
                if (eh8.c().f().d()) {
                    if (fragmentManager.E("android.support.v7.mediarouter:MediaRouteChooserDialogFragment") == null) {
                        this.o.getClass();
                        MediaRouteChooserDialogFragment mediaRouteChooserDialogFragment = new MediaRouteChooserDialogFragment();
                        wg8 wg8 = this.c;
                        if (wg8 != null) {
                            mediaRouteChooserDialogFragment.l1();
                            if (!mediaRouteChooserDialogFragment.D1.equals(wg8)) {
                                mediaRouteChooserDialogFragment.D1 = wg8;
                                Bundle bundle = mediaRouteChooserDialogFragment.Z;
                                if (bundle == null) {
                                    bundle = new Bundle();
                                }
                                bundle.putBundle("selector", wg8.a);
                                mediaRouteChooserDialogFragment.X0(bundle);
                                fn fnVar = mediaRouteChooserDialogFragment.C1;
                                if (fnVar != null) {
                                    if (mediaRouteChooserDialogFragment.B1) {
                                        ((gg8) fnVar).h(wg8);
                                    } else {
                                        ((qf8) fnVar).h(wg8);
                                    }
                                }
                            }
                            he0 he0 = new he0(fragmentManager);
                            he0.f(0, mediaRouteChooserDialogFragment, "android.support.v7.mediarouter:MediaRouteChooserDialogFragment", 1);
                            he0.d(true);
                            return true;
                        }
                        throw new IllegalArgumentException("selector must not be null");
                    }
                } else if (fragmentManager.E("android.support.v7.mediarouter:MediaRouteControllerDialogFragment") == null) {
                    this.o.getClass();
                    MediaRouteControllerDialogFragment mediaRouteControllerDialogFragment = new MediaRouteControllerDialogFragment();
                    wg8 wg82 = this.c;
                    if (wg82 != null) {
                        if (mediaRouteControllerDialogFragment.D1 == null) {
                            Bundle bundle2 = mediaRouteControllerDialogFragment.Z;
                            if (bundle2 != null) {
                                Bundle bundle3 = bundle2.getBundle("selector");
                                wg8 wg83 = null;
                                if (bundle3 != null) {
                                    wg83 = new wg8((List) null, bundle3);
                                } else {
                                    wg8 wg84 = wg8.c;
                                }
                                mediaRouteControllerDialogFragment.D1 = wg83;
                            }
                            if (mediaRouteControllerDialogFragment.D1 == null) {
                                mediaRouteControllerDialogFragment.D1 = wg8.c;
                            }
                        }
                        if (!mediaRouteControllerDialogFragment.D1.equals(wg82)) {
                            mediaRouteControllerDialogFragment.D1 = wg82;
                            Bundle bundle4 = mediaRouteControllerDialogFragment.Z;
                            if (bundle4 == null) {
                                bundle4 = new Bundle();
                            }
                            bundle4.putBundle("selector", wg82.a);
                            mediaRouteControllerDialogFragment.X0(bundle4);
                            fn fnVar2 = mediaRouteControllerDialogFragment.C1;
                            if (fnVar2 != null && mediaRouteControllerDialogFragment.B1) {
                                ((pg8) fnVar2).j(wg82);
                            }
                        }
                        he0 he02 = new he0(fragmentManager);
                        he02.f(0, mediaRouteControllerDialogFragment, "android.support.v7.mediarouter:MediaRouteControllerDialogFragment", 1);
                        he02.d(true);
                        return true;
                    }
                    throw new IllegalArgumentException("selector must not be null");
                }
            } else {
                throw new IllegalStateException("The activity must be a subclass of FragmentActivity");
            }
        }
        if (!performClick) {
            return false;
        }
        return true;
    }

    public void setAlwaysVisible(boolean z) {
        if (z != this.C0) {
            this.C0 = z;
            c();
            b();
        }
    }

    public void setCheatSheetEnabled(boolean z) {
        if (z != this.D0) {
            this.D0 = z;
            e();
        }
    }

    public void setDialogFactory(ag8 ag8) {
        if (ag8 != null) {
            this.o = ag8;
            return;
        }
        throw new IllegalArgumentException("factory must not be null");
    }

    public void setRemoteIndicatorDrawable(Drawable drawable) {
        this.w0 = 0;
        setRemoteIndicatorDrawableInternal(drawable);
    }

    public void setRemoteIndicatorDrawableInternal(Drawable drawable) {
        nf8 nf8 = this.u0;
        if (nf8 != null) {
            nf8.cancel(false);
        }
        Drawable drawable2 = this.v0;
        if (drawable2 != null) {
            drawable2.setCallback((Drawable.Callback) null);
            unscheduleDrawable(this.v0);
        }
        if (drawable != null) {
            ColorStateList colorStateList = this.z0;
            if (colorStateList != null) {
                drawable = drawable.mutate();
                aq4.h(drawable, colorStateList);
            }
            drawable.setCallback(this);
            drawable.setState(getDrawableState());
            drawable.setVisible(getVisibility() == 0, false);
        }
        this.v0 = drawable;
        refreshDrawableState();
    }

    public void setRouteSelector(wg8 wg8) {
        if (wg8 == null) {
            throw new IllegalArgumentException("selector must not be null");
        } else if (!this.c.equals(wg8)) {
            if (this.s0) {
                boolean c2 = this.c.c();
                mf8 mf8 = this.b;
                eh8 eh8 = this.a;
                if (!c2) {
                    eh8.f(mf8);
                }
                if (!wg8.c()) {
                    eh8.a(wg8, mf8, 0);
                }
            }
            this.c = wg8;
            b();
        }
    }

    public void setVisibility(int i) {
        this.t0 = i;
        c();
    }

    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.v0;
    }
}
