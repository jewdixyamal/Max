package defpackage;

import android.animation.ObjectAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import java.util.Arrays;

/* renamed from: zef  reason: default package */
public final class zef extends dle implements cmf, bmf {
    public a66 X;
    public o00 Y;
    public Long Z;
    public a66 o;
    public ObjectAnimator s0;
    public final AccelerateDecelerateInterpolator t0 = new AccelerateDecelerateInterpolator();

    public zef() {
        super((m56) new w8c(26));
    }

    public final boolean m() {
        return br7.H((je7) this.c);
    }

    public final void o(tlf tlf, o00 o00, long j, boolean z, boolean z2) {
        ObjectAnimator objectAnimator;
        this.Z = Long.valueOf(j);
        this.Y = o00;
        ((amf) Q()).a(tlf);
        amf amf = (amf) Q();
        ViewGroup viewGroup = (ViewGroup) this.b;
        bmf bmf = null;
        if (viewGroup == null) {
            viewGroup = null;
        }
        if (viewGroup instanceof bmf) {
            bmf = (bmf) viewGroup;
        }
        amf.setVideoShape(bmf != null ? bmf.r(z) : r(z));
        ((amf) Q()).setVideoContentMode(o00 instanceof wgf ? ulf.b : ulf.a);
        tu0.K(Q(), 300, new elb(13, (Object) this));
        ((amf) Q()).setOnLongClickListener(new zl0(11, this));
        t();
        if (z2 && ((amf) Q()).getAlpha() < 1.0f && ((objectAnimator = this.s0) == null || !objectAnimator.isRunning())) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(Q(), View.ALPHA, new float[]{((amf) Q()).getAlpha(), 1.0f});
            ofFloat.setDuration(500);
            ofFloat.setInterpolator(this.t0);
            ofFloat.start();
            this.s0 = ofFloat;
        }
        View Q = Q();
        if (!Q.isAttachedToWindow()) {
            amf amf2 = (amf) Q();
            if (amf2.b != null && amf2.getChildCount() > 0) {
                u();
                return;
            }
            return;
        }
        Q.addOnAttachStateChangeListener(new o50(Q, 12, this));
    }

    public final xlf r(boolean z) {
        ViewGroup viewGroup = (ViewGroup) this.b;
        if (viewGroup == null) {
            viewGroup = null;
        }
        float[] fArr = ((vs8) viewGroup.getBackground()).p;
        float[] copyOf = Arrays.copyOf(fArr, fArr.length);
        if (z) {
            copyOf[0] = 0.0f;
            copyOf[1] = 0.0f;
            copyOf[2] = 0.0f;
            copyOf[3] = 0.0f;
        }
        return new wlf(copyOf);
    }

    public final boolean s() {
        je7 je7 = (je7) this.c;
        if (je7.a()) {
            amf amf = (amf) je7.getValue();
            return amf.b != null && amf.getChildCount() > 0;
        }
    }

    public final void setVideoClickListener(a66 a66) {
        this.o = a66;
    }

    public final void setVideoLongClickListener(a66 a66) {
        this.X = a66;
    }

    public final void u() {
        je7 je7 = (je7) this.c;
        if (je7.a()) {
            amf amf = (amf) je7.getValue();
            ObjectAnimator objectAnimator = this.s0;
            if (objectAnimator != null) {
                objectAnimator.cancel();
            }
            amf.setAlpha(0.0f);
            amf.setVisibility(8);
            amf.b();
        }
    }
}
