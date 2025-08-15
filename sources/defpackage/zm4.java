package defpackage;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLExt;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.util.Size;
import android.view.GestureDetector;
import android.view.Surface;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import org.webrtc.EglBase;

/* renamed from: zm4  reason: default package */
public class zm4 implements fye {
    public final /* synthetic */ int a;
    public int b;
    public final Object c;
    public final Object d;
    public Object e;
    public Object f;
    public Object g;
    public Object h;
    public Object i;
    public Object j;
    public Object k;
    public Object l;
    public Object m;
    public Object n;

    public zm4(Context context, s0b s0b, rzd rzd, u5e u5e) {
        this.a = 0;
        this.c = s0b;
        this.d = rzd;
        this.e = u5e;
        jn jnVar = new jn(context);
        this.f = jnVar;
        jn jnVar2 = new jn(context);
        this.g = jnVar2;
        this.h = new GestureDetector(context, new q00(7, this));
        this.i = new es3(8, this);
        this.j = new Rect();
        this.b = tu0.G(((float) 92) * fk4.d().getDisplayMetrics().density);
        this.k = tu0.r(3, new xm4(this, context, 0));
        this.l = tu0.r(3, new xm4(this, context, 1));
        jnVar2.c = new gaa((Object) this);
        jnVar.c = new w4d(13, (Object) this);
    }

    /* JADX WARNING: type inference failed for: r5v3, types: [android.view.View] */
    /* JADX WARNING: type inference failed for: r5v4, types: [android.view.View] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void a(defpackage.zm4 r16, boolean r17, int r18) {
        /*
            r0 = r16
            java.lang.Object r1 = r0.i
            es3 r1 = (defpackage.es3) r1
            yh0 r2 = new yh0
            r3 = 3
            r2.<init>(r3, r1)
            java.lang.Object r3 = r0.c
            android.widget.FrameLayout r3 = (android.widget.FrameLayout) r3
            r3.removeCallbacks(r2)
            android.content.Context r2 = r3.getContext()
            int r4 = defpackage.l8a.c
            java.lang.Integer r5 = java.lang.Integer.valueOf(r18)
            java.lang.Object[] r5 = new java.lang.Object[]{r5}
            java.lang.String r2 = r2.getString(r4, r5)
            r4 = 0
            r5 = 0
            if (r17 == 0) goto L_0x0061
            android.view.ViewGroup r6 = r16.k()
            java.lang.Object r7 = r0.m
            android.animation.Animator r7 = (android.animation.Animator) r7
            android.animation.Animator r6 = c(r6, r7)
            r0.m = r6
            android.view.ViewGroup r6 = r16.k()
            defpackage.br7.b(r3, r6, -1)
            android.view.ViewGroup r6 = r16.k()
            android.view.View r5 = r6.getChildAt(r5)
            boolean r6 = r5 instanceof android.widget.TextView
            if (r6 == 0) goto L_0x004d
            r4 = r5
            android.widget.TextView r4 = (android.widget.TextView) r4
        L_0x004d:
            if (r4 == 0) goto L_0x0052
            r4.setText(r2)
        L_0x0052:
            android.view.ViewGroup r2 = r16.k()
            java.lang.Object r4 = r0.m
            android.animation.Animator r4 = (android.animation.Animator) r4
            android.animation.Animator r2 = b(r2, r4)
            r0.m = r2
            goto L_0x0098
        L_0x0061:
            android.view.ViewGroup r6 = r16.m()
            java.lang.Object r7 = r0.n
            android.animation.Animator r7 = (android.animation.Animator) r7
            android.animation.Animator r6 = c(r6, r7)
            r0.n = r6
            android.view.ViewGroup r6 = r16.m()
            defpackage.br7.b(r3, r6, -1)
            android.view.ViewGroup r6 = r16.m()
            android.view.View r5 = r6.getChildAt(r5)
            boolean r6 = r5 instanceof android.widget.TextView
            if (r6 == 0) goto L_0x0085
            r4 = r5
            android.widget.TextView r4 = (android.widget.TextView) r4
        L_0x0085:
            if (r4 == 0) goto L_0x008a
            r4.setText(r2)
        L_0x008a:
            android.view.ViewGroup r2 = r16.m()
            java.lang.Object r4 = r0.n
            android.animation.Animator r4 = (android.animation.Animator) r4
            android.animation.Animator r2 = b(r2, r4)
            r0.n = r2
        L_0x0098:
            java.lang.Object r2 = r0.d
            k56 r2 = (defpackage.k56) r2
            java.lang.Object r2 = r2.invoke()
            dkf r2 = (defpackage.dkf) r2
            if (r2 != 0) goto L_0x00b1
            java.lang.Class<zm4> r0 = defpackage.zm4.class
            java.lang.String r0 = r0.getName()
            java.lang.String r1 = "Media viewer. Can't seek by double tap because player is null"
            defpackage.hm9.m(r0, r1, new java.lang.Object[0])
            goto L_0x0129
        L_0x00b1:
            long r4 = r2.F0()
            r6 = 10000(0x2710, float:1.4013E-41)
            long r6 = (long) r6
            if (r17 == 0) goto L_0x00bc
            long r4 = r4 + r6
            goto L_0x00bd
        L_0x00bc:
            long r4 = r4 - r6
        L_0x00bd:
            long r6 = r2.G0()
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 <= 0) goto L_0x00c9
            r16.d()
            r4 = r6
        L_0x00c9:
            r6 = 0
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 >= 0) goto L_0x00d3
            r16.d()
            r4 = r6
        L_0x00d3:
            boolean r8 = r2.H0()
            if (r8 != 0) goto L_0x00e2
            u75 r8 = r2.o
            int r8 = r8.getPlaybackState()
            r9 = 1
            if (r8 != r9) goto L_0x011b
        L_0x00e2:
            java.lang.Object r0 = r0.e
            u5e r0 = (defpackage.u5e) r0
            r0.getClass()
            bc7[] r8 = one.me.chatmedia.viewer.video.VideoViewerWidget.u0
            java.lang.Object r0 = r0.a
            one.me.chatmedia.viewer.video.VideoViewerWidget r0 = (one.me.chatmedia.viewer.video.VideoViewerWidget) r0
            dmf r0 = r0.o0()
            if (r0 == 0) goto L_0x011b
            one.me.chatmedia.viewer.ChatMediaViewerScreen r0 = (one.me.chatmedia.viewer.ChatMediaViewerScreen) r0
            g07 r9 = r0.A0()
            dkf r8 = r0.B0()
            gef r10 = r8.Z
            if (r10 == 0) goto L_0x010e
            u75 r6 = r8.o
            long r6 = r6.e0()
            long r10 = r10.m()
            long r6 = r6 - r10
        L_0x010e:
            r12 = r6
            dkf r0 = r0.B0()
            long r14 = r0.G0()
            r10 = r4
            r9.c(r10, r12, r14)
        L_0x011b:
            r2.J0(r4)
            yh0 r0 = new yh0
            r2 = 4
            r0.<init>(r2, r1)
            r1 = 600(0x258, double:2.964E-321)
            r3.postDelayed(r0, r1)
        L_0x0129:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zm4.a(zm4, boolean, int):void");
    }

    public static Animator b(ViewGroup viewGroup, Animator animator) {
        if (viewGroup.getVisibility() == 0 && animator != null && animator.isRunning()) {
            return animator;
        }
        if (animator != null) {
            animator.cancel();
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(viewGroup, View.ALPHA, new float[]{viewGroup.getAlpha(), 1.0f});
        ofFloat.setDuration(200);
        ofFloat.addListener(new ym4(viewGroup, 0));
        ofFloat.start();
        return ofFloat;
    }

    public static Animator c(ViewGroup viewGroup, Animator animator) {
        if (viewGroup.getVisibility() != 0) {
            return animator;
        }
        if (animator != null && animator.isRunning()) {
            return animator;
        }
        if (animator != null) {
            animator.cancel();
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(viewGroup, View.ALPHA, new float[]{viewGroup.getAlpha(), 0.0f});
        ofFloat.setDuration(200);
        ofFloat.addListener(new ym4(viewGroup, 1));
        ofFloat.start();
        return ofFloat;
    }

    public void d() {
        if (k().getVisibility() == 0) {
            this.m = c(k(), (Animator) this.m);
        }
        if (m().getVisibility() == 0) {
            this.n = c(m(), (Animator) this.n);
        }
        ((jn) this.f).b = 0;
        ((jn) this.g).b = 0;
    }

    public void e() {
        int s = au1.s(this.b);
        if (s == 0 || s == 1) {
            u();
        } else if (s == 2 || s == 3) {
            this.b = 3;
        } else if (s != 4) {
            throw new IllegalStateException("State " + h4f.v(this.b) + " is not handled");
        }
    }

    public FrameLayout f(Context context, boolean z) {
        FrameLayout frameLayout = new FrameLayout(context);
        int i2 = z ? 8388629 : 8388627;
        int i3 = this.b;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i3, i3, i2);
        if (z) {
            layoutParams.rightMargin = tu0.G(((float) 24) * fk4.d().getDisplayMetrics().density);
        } else {
            layoutParams.leftMargin = tu0.G(((float) 24) * fk4.d().getDisplayMetrics().density);
        }
        frameLayout.setLayoutParams(layoutParams);
        TextView textView = new TextView(context);
        textView.setLayoutParams(new FrameLayout.LayoutParams(-2, -2, 17));
        i4f.G.b(textView, du4.b);
        pq9 pq9 = qp4.u0;
        textView.setTextColor(pq9.p(textView).c.getText().e);
        int i4 = z ? j8a.a : j8a.b;
        bs6 icon = pq9.p(textView).c.getIcon();
        Drawable b2 = kt3.b(textView.getContext(), i4);
        ngg.G(b2, icon.f);
        ArrayList arrayList = qqe.a;
        textView.setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable) null, b2, (Drawable) null, (Drawable) null);
        frameLayout.addView(textView);
        ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
        pq9.p(frameLayout).c.b();
        shapeDrawable.setTint(-1728053248);
        frameLayout.setBackground(shapeDrawable);
        frameLayout.setVisibility(8);
        return frameLayout;
    }

    public void g(eu4 eu4, m5d m5d) {
        m5d m5d2 = m5d;
        EGLDisplay eglGetDisplay = EGL14.eglGetDisplay(0);
        this.f = eglGetDisplay;
        if (!Objects.equals(eglGetDisplay, EGL14.EGL_NO_DISPLAY)) {
            int i2 = 2;
            int[] iArr = new int[2];
            if (EGL14.eglInitialize((EGLDisplay) this.f, iArr, 0, iArr, 1)) {
                if (m5d2 != null) {
                    String str = iArr[0] + "." + iArr[1];
                    if (str != null) {
                        m5d2.c = str;
                    } else {
                        throw new NullPointerException("Null eglVersion");
                    }
                }
                int i3 = eu4.a() ? 10 : 8;
                EGLConfig[] eGLConfigArr = new EGLConfig[1];
                if (EGL14.eglChooseConfig((EGLDisplay) this.f, new int[]{12324, i3, 12323, i3, 12322, i3, 12321, eu4.a() ? 2 : 8, 12325, 0, 12326, 0, 12352, eu4.a() ? 64 : 4, EglBase.EGL_RECORDABLE_ANDROID, eu4.a() ? -1 : 1, 12339, 5, 12344}, 0, eGLConfigArr, 0, 1, new int[1], 0)) {
                    EGLConfig eGLConfig = eGLConfigArr[0];
                    if (eu4.a()) {
                        i2 = 3;
                    }
                    EGLContext eglCreateContext = EGL14.eglCreateContext((EGLDisplay) this.f, eGLConfig, EGL14.EGL_NO_CONTEXT, new int[]{12440, i2, 12344}, 0);
                    o76.a("eglCreateContext");
                    this.i = eGLConfig;
                    this.g = eglCreateContext;
                    EGL14.eglQueryContext((EGLDisplay) this.f, eglCreateContext, 12440, new int[1], 0);
                    return;
                }
                throw new IllegalStateException("Unable to find a suitable EGLConfig");
            }
            this.f = EGL14.EGL_NO_DISPLAY;
            throw new IllegalStateException("Unable to initialize EGL14");
        }
        throw new IllegalStateException("Unable to get EGL14 display");
    }

    public db0 h(Surface surface) {
        try {
            EGLConfig eGLConfig = (EGLConfig) this.i;
            Objects.requireNonNull(eGLConfig);
            EGLSurface h2 = o76.h((EGLDisplay) this.f, eGLConfig, surface, (int[]) this.h);
            EGLDisplay eGLDisplay = (EGLDisplay) this.f;
            int[] iArr = new int[1];
            EGL14.eglQuerySurface(eGLDisplay, h2, 12375, iArr, 0);
            int i2 = iArr[0];
            int[] iArr2 = new int[1];
            EGL14.eglQuerySurface(eGLDisplay, h2, 12374, iArr2, 0);
            Size size = new Size(i2, iArr2[0]);
            return new db0(h2, size.getWidth(), size.getHeight());
        } catch (IllegalArgumentException | IllegalStateException e2) {
            e2.getMessage();
            return null;
        }
    }

    public void i() {
        EGLConfig eGLConfig = (EGLConfig) this.i;
        Objects.requireNonNull(eGLConfig);
        int[] iArr = o76.a;
        EGLSurface eglCreatePbufferSurface = EGL14.eglCreatePbufferSurface((EGLDisplay) this.f, eGLConfig, new int[]{12375, 1, 12374, 1, 12344}, 0);
        o76.a("eglCreatePbufferSurface");
        if (eglCreatePbufferSurface != null) {
            this.j = eglCreatePbufferSurface;
            return;
        }
        throw new IllegalStateException("surface was null");
    }

    public mpa j(eu4 eu4) {
        o76.d((AtomicBoolean) this.c, false);
        try {
            g(eu4, (m5d) null);
            i();
            o((EGLSurface) this.j);
            String glGetString = GLES20.glGetString(7939);
            String eglQueryString = EGL14.eglQueryString((EGLDisplay) this.f, 12373);
            if (glGetString == null) {
                glGetString = "";
            }
            if (eglQueryString == null) {
                eglQueryString = "";
            }
            return new mpa(glGetString, eglQueryString);
        } catch (IllegalStateException e2) {
            e2.getMessage();
            return new mpa("", "");
        } finally {
            r();
        }
    }

    public ViewGroup k() {
        return (ViewGroup) ((je7) this.k).getValue();
    }

    public db0 l(Surface surface) {
        HashMap hashMap = (HashMap) this.d;
        c54.p("The surface is not registered.", hashMap.containsKey(surface));
        db0 db0 = (db0) hashMap.get(surface);
        Objects.requireNonNull(db0);
        return db0;
    }

    public ViewGroup m() {
        return (ViewGroup) ((je7) this.l).getValue();
    }

    public na0 n(eu4 eu4, Map map) {
        AtomicBoolean atomicBoolean = (AtomicBoolean) this.c;
        o76.d(atomicBoolean, false);
        m5d m5d = new m5d(3);
        m5d.b = "0.0";
        m5d.c = "0.0";
        String str = "";
        m5d.o = str;
        m5d.X = str;
        try {
            if (eu4.a()) {
                mpa j2 = j(eu4);
                String str2 = (String) j2.a;
                str2.getClass();
                String str3 = (String) j2.b;
                str3.getClass();
                if (!str2.contains("GL_EXT_YUV_target")) {
                    eu4 = eu4.d;
                }
                int[] iArr = o76.a;
                if (eu4.a == 3 && str3.contains("EGL_EXT_gl_colorspace_bt2020_hlg")) {
                    iArr = o76.b;
                }
                this.h = iArr;
                m5d.o = str2;
                m5d.X = str3;
            }
            g(eu4, m5d);
            i();
            o((EGLSurface) this.j);
            String i2 = o76.i();
            if (i2 != null) {
                m5d.b = i2;
                this.l = o76.f(eu4, map);
                int g2 = o76.g();
                this.b = g2;
                v(g2);
                this.e = Thread.currentThread();
                atomicBoolean.set(true);
                if (((String) m5d.b) == null) {
                    str = " glVersion";
                }
                if (((String) m5d.c) == null) {
                    str = str.concat(" eglVersion");
                }
                if (((String) m5d.o) == null) {
                    str = au1.g(str, " glExtensions");
                }
                if (((String) m5d.X) == null) {
                    str = au1.g(str, " eglExtensions");
                }
                if (str.isEmpty()) {
                    return new na0((String) m5d.b, (String) m5d.c, (String) m5d.o, (String) m5d.X);
                }
                throw new IllegalStateException("Missing required properties:".concat(str));
            }
            throw new NullPointerException("Null glVersion");
        } catch (IllegalArgumentException | IllegalStateException e2) {
            r();
            throw e2;
        }
    }

    public void o(EGLSurface eGLSurface) {
        ((EGLDisplay) this.f).getClass();
        ((EGLContext) this.g).getClass();
        if (!EGL14.eglMakeCurrent((EGLDisplay) this.f, eGLSurface, eGLSurface, (EGLContext) this.g)) {
            throw new IllegalStateException("eglMakeCurrent failed");
        }
    }

    public void p(Surface surface) {
        o76.d((AtomicBoolean) this.c, true);
        o76.c((Thread) this.e);
        HashMap hashMap = (HashMap) this.d;
        if (!hashMap.containsKey(surface)) {
            hashMap.put(surface, o76.j);
        }
    }

    public void q() {
        if (((AtomicBoolean) this.c).getAndSet(false)) {
            o76.c((Thread) this.e);
            r();
        }
    }

    public void r() {
        for (m76 m76 : ((Map) this.l).values()) {
            GLES20.glDeleteProgram(m76.a);
        }
        this.l = Collections.emptyMap();
        this.m = null;
        if (!Objects.equals((EGLDisplay) this.f, EGL14.EGL_NO_DISPLAY)) {
            EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
            EGL14.eglMakeCurrent((EGLDisplay) this.f, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
            HashMap hashMap = (HashMap) this.d;
            for (db0 db0 : hashMap.values()) {
                if (!Objects.equals(db0.a, EGL14.EGL_NO_SURFACE) && !EGL14.eglDestroySurface((EGLDisplay) this.f, db0.a)) {
                    try {
                        o76.a("eglDestroySurface");
                    } catch (IllegalStateException e2) {
                        e2.toString();
                    }
                }
            }
            hashMap.clear();
            if (!Objects.equals((EGLSurface) this.j, EGL14.EGL_NO_SURFACE)) {
                EGL14.eglDestroySurface((EGLDisplay) this.f, (EGLSurface) this.j);
                this.j = EGL14.EGL_NO_SURFACE;
            }
            if (!Objects.equals((EGLContext) this.g, EGL14.EGL_NO_CONTEXT)) {
                EGL14.eglDestroyContext((EGLDisplay) this.f, (EGLContext) this.g);
                this.g = EGL14.EGL_NO_CONTEXT;
            }
            EGL14.eglReleaseThread();
            EGL14.eglTerminate((EGLDisplay) this.f);
            this.f = EGL14.EGL_NO_DISPLAY;
        }
        this.i = null;
        this.b = -1;
        this.n = l76.a;
        this.k = null;
        this.e = null;
    }

    public void s(Surface surface, boolean z) {
        if (((Surface) this.k) == surface) {
            this.k = null;
            o((EGLSurface) this.j);
        }
        HashMap hashMap = (HashMap) this.d;
        db0 db0 = z ? (db0) hashMap.remove(surface) : (db0) hashMap.put(surface, o76.j);
        if (db0 != null && db0 != o76.j) {
            try {
                EGL14.eglDestroySurface((EGLDisplay) this.f, db0.a);
            } catch (RuntimeException e2) {
                e2.getMessage();
            }
        }
    }

    public void t(long j2, float[] fArr, Surface surface) {
        o76.d((AtomicBoolean) this.c, true);
        o76.c((Thread) this.e);
        db0 l2 = l(surface);
        if (l2 == o76.j) {
            l2 = h(surface);
            if (l2 != null) {
                ((HashMap) this.d).put(surface, l2);
            } else {
                return;
            }
        }
        Surface surface2 = (Surface) this.k;
        EGLSurface eGLSurface = l2.a;
        if (surface != surface2) {
            o(eGLSurface);
            this.k = surface;
            int i2 = l2.b;
            int i3 = l2.c;
            GLES20.glViewport(0, 0, i2, i3);
            GLES20.glScissor(0, 0, i2, i3);
        }
        m76 m76 = (m76) this.m;
        m76.getClass();
        if (m76 instanceof n76) {
            GLES20.glUniformMatrix4fv(((n76) m76).f, 1, false, fArr, 0);
            o76.b("glUniformMatrix4fv");
        }
        GLES20.glDrawArrays(5, 0, 4);
        o76.b("glDrawArrays");
        EGLExt.eglPresentationTimeANDROID((EGLDisplay) this.f, eGLSurface, j2);
        if (!EGL14.eglSwapBuffers((EGLDisplay) this.f, eGLSurface)) {
            Integer.toHexString(EGL14.eglGetError());
            s(surface, false);
        }
    }

    public String toString() {
        switch (this.a) {
            case 2:
                return "VideoEncoderSession@" + hashCode() + " for " + Objects.toString((see) this.h, "SURFACE_REQUEST_NOT_CONFIGURED");
            default:
                return super.toString();
        }
    }

    public void u() {
        int s = au1.s(this.b);
        if (s == 0) {
            this.b = 5;
        } else if (s == 1 || s == 2 || s == 3) {
            this.b = 5;
            ((lq1) this.n).b((d15) this.f);
            this.h = null;
            d15 d15 = (d15) this.f;
            if (d15 != null) {
                Objects.toString(d15);
                d15 d152 = (d15) this.f;
                d152.getClass();
                d152.h.execute(new r05(d152, 4));
                ((d15) this.f).i.d(new ule(11, this), (Executor) this.d);
                this.f = null;
                return;
            }
            ((lq1) this.l).b((Object) null);
        } else if (s != 4) {
            throw new IllegalStateException("State " + h4f.v(this.b) + " is not handled");
        }
    }

    public void v(int i2) {
        m76 m76 = (m76) ((Map) this.l).get((l76) this.n);
        if (m76 != null) {
            if (((m76) this.m) != m76) {
                this.m = m76;
                m76.b();
                Objects.toString((l76) this.n);
                Objects.toString((m76) this.m);
            }
            GLES20.glActiveTexture(33984);
            o76.b("glActiveTexture");
            GLES20.glBindTexture(36197, i2);
            o76.b("glBindTexture");
            return;
        }
        throw new IllegalStateException("Unable to configure program for input format: " + ((l76) this.n));
    }

    public zm4() {
        this.a = 1;
        this.c = new AtomicBoolean(false);
        this.d = new HashMap();
        this.f = EGL14.EGL_NO_DISPLAY;
        this.g = EGL14.EGL_NO_CONTEXT;
        this.h = o76.a;
        this.j = EGL14.EGL_NO_SURFACE;
        this.l = Collections.emptyMap();
        this.m = null;
        this.n = l76.a;
        this.b = -1;
    }

    public zm4(av1 av1, q6d q6d, Executor executor) {
        this.a = 2;
        this.f = null;
        this.g = null;
        this.h = null;
        this.i = null;
        this.j = null;
        this.b = 1;
        this.k = new dw6(1, new IllegalStateException("Cannot close the encoder before configuring."));
        this.l = null;
        this.m = new dw6(1, new IllegalStateException("Cannot close the encoder before configuring."));
        this.n = null;
        this.c = executor;
        this.d = q6d;
        this.e = av1;
    }
}
