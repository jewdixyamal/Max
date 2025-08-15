package one.me.chatmedia.viewer.video;

import android.animation.ObjectAnimator;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Surface;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import one.me.chatmedia.viewer.ChatMediaViewerScreen;
import one.me.sdk.arch.Widget;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\rB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B!\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u0004\u0010\f¨\u0006\u000e"}, d2 = {"Lone/me/chatmedia/viewer/video/VideoViewerWidget;", "Lone/me/sdk/arch/Widget;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "", "messageId", "", "attachId", "Lsuc;", "scopeId", "(JLjava/lang/String;Ljava/lang/String;Lz84;)V", "dmf", "chat-media-viewer_release"}, k = 1, mv = {2, 0, 0})
@SuppressLint({"ValidController"})
public final class VideoViewerWidget extends Widget {
    public static final /* synthetic */ bc7[] u0;
    public final q7c X;
    public final q7c Y;
    public cjg Z;
    public final String a;
    public final fs b;
    public final fs c;
    public final je7 o;
    public gef s0;
    public final w5e t0;

    static {
        Class<VideoViewerWidget> cls = VideoViewerWidget.class;
        hob hob = new hob(cls, "msgId", "getMsgId()J", 0);
        oec oec = nec.a;
        u0 = new bc7[]{hob, zr6.e(oec, cls, "localAttachId", "getLocalAttachId()Ljava/lang/String;", 0), zr6.f(cls, "parentScopeId", "getParentScopeId-IluPPks()Ljava/lang/String;", 0, oec), zr6.f(cls, "videoPreviewView", "getVideoPreviewView()Lone/me/chatmedia/viewer/video/VideoPreviewView;", 0, oec), zr6.f(cls, "videoView", "getVideoView()Lone/me/sdk/media/player/view/VideoView;", 0, oec)};
    }

    public VideoViewerWidget(Bundle bundle) {
        super(bundle, 0, 2, (z84) null);
        this.a = VideoViewerWidget.class.getName();
        this.b = new fs(Long.class, 0L, "chat.media.viewer.message_id");
        this.c = new fs(String.class, "", "chat.media.viewer.attach_id");
        fs fsVar = new fs(suc.class, new suc(m81getScopeIdIluPPks()), Widget.ARG_SCOPE_ID);
        bc7 bc7 = u0[2];
        this.o = m82getSharedViewModelcp94BC8(((suc) fsVar.a(this)).a, ck2.class, (k56) null);
        this.X = viewBinding(k8a.o);
        this.Y = viewBinding(k8a.p);
        this.t0 = new w5e(this);
    }

    public final String m0() {
        bc7 bc7 = u0[1];
        return (String) this.c.a(this);
    }

    public final long n0() {
        bc7 bc7 = u0[0];
        return ((Number) this.b.a(this)).longValue();
    }

    public final dmf o0() {
        uu3 targetController = getTargetController();
        if (targetController instanceof dmf) {
            return (dmf) targetController;
        }
        return null;
    }

    public final void onActivityStarted(Activity activity) {
        dmf o0;
        dkf B0;
        super.onActivityStarted(activity);
        if (getView() != null && this.s0 != null && (o0 = o0()) != null && (B0 = ((ChatMediaViewerScreen) o0).B0()) != null && B0.H0()) {
            p0().a(this.t0);
        }
    }

    public final void onActivityStopped(Activity activity) {
        dkf B0;
        super.onActivityStopped(activity);
        if (getView() != null && this.s0 != null) {
            dmf o0 = o0();
            if (!(o0 == null || (B0 = ((ChatMediaViewerScreen) o0).B0()) == null)) {
                B0.pause();
                B0.M0((Surface) null);
            }
            p0().b();
        }
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        s0b s0b = new s0b(getContext());
        s0b.setId(k8a.q);
        s0b.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        s0b.setTouchEventDelegate(new zm4(s0b.getContext(), s0b, new rzd(14, this), new u5e(this)));
        jkf jkf = new jkf(s0b.getContext());
        jkf.setId(k8a.o);
        jkf.setLayoutParams(new FrameLayout.LayoutParams(-2, -2, 17));
        s0b.addView(jkf);
        amf amf = new amf(s0b.getContext());
        amf.setId(k8a.p);
        amf.setAlpha(0.0f);
        amf.setLayoutParams(new FrameLayout.LayoutParams(-2, -2, 17));
        this.Z = new cjg(amf);
        s0b.addView(amf);
        return s0b;
    }

    public final void onDestroyView(View view) {
        ObjectAnimator objectAnimator;
        super.onDestroyView(view);
        cjg cjg = this.Z;
        if (!(cjg == null || (objectAnimator = (ObjectAnimator) cjg.b) == null)) {
            objectAnimator.cancel();
        }
        this.Z = null;
        this.s0 = null;
        p0().b();
    }

    public final void onViewCreated(View view) {
        je7 je7 = this.o;
        w7c w7c = ((ck2) je7.getValue()).W0;
        fg7 fg7 = fg7.o;
        od2.L(new zn5(tu0.g(w7c, getViewLifecycleOwner().Q(), fg7), new emf((Continuation) null, this), 5), getViewLifecycleScope());
        sb8 y = ((ck2) je7.getValue()).y(n0(), m0());
        qb8 qb8 = y instanceof qb8 ? (qb8) y : null;
        if (qb8 != null) {
            jkf jkf = (jkf) this.X.T0(this, u0[3]);
            wcf wcf = jkf.D0;
            wcf wcf2 = qb8.o;
            boolean z = !wcf2.equals(wcf);
            jkf.D0 = wcf2;
            if (z) {
                jkf.o(wv6.a(wcf2.b), wv6.a(wcf2.h));
            }
            od2.L(new zn5(tu0.g(((ck2) je7.getValue()).N0, getViewLifecycleOwner().Q(), fg7), new fmf((Continuation) null, this), 5), getViewLifecycleScope());
        }
    }

    public final amf p0() {
        return (amf) this.Y.T0(this, u0[4]);
    }

    public VideoViewerWidget(long j, String str, String str2, z84 z84) {
        this(dy7.g(new kpa("chat.media.viewer.message_id", Long.valueOf(j)), new kpa("chat.media.viewer.attach_id", str), new kpa(Widget.ARG_SCOPE_ID, new suc(str2))));
    }
}
