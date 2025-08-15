package one.me.chatmedia.viewer.photo;

import android.animation.ObjectAnimator;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
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

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B!\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u0004\u0010\f¨\u0006\r"}, d2 = {"Lone/me/chatmedia/viewer/photo/GifViewerWidget;", "Lone/me/sdk/arch/Widget;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "", "messageId", "", "attachId", "Lsuc;", "scopeId", "(JLjava/lang/String;Ljava/lang/String;Lz84;)V", "chat-media-viewer_release"}, k = 1, mv = {2, 0, 0})
@SuppressLint({"ValidController"})
public final class GifViewerWidget extends Widget {
    public static final /* synthetic */ bc7[] u0;
    public final q7c X;
    public final q7c Y;
    public cjg Z;
    public final String a;
    public final fs b;
    public final fs c;
    public final je7 o;
    public gef s0;
    public final rxd t0;

    static {
        Class<GifViewerWidget> cls = GifViewerWidget.class;
        hob hob = new hob(cls, "msgId", "getMsgId()J", 0);
        oec oec = nec.a;
        u0 = new bc7[]{hob, zr6.e(oec, cls, "localAttachId", "getLocalAttachId()Ljava/lang/String;", 0), zr6.f(cls, "parentScopeId", "getParentScopeId-IluPPks()Ljava/lang/String;", 0, oec), zr6.f(cls, "photoView", "getPhotoView()Lone/me/chatmedia/viewer/photo/PhotoView;", 0, oec), zr6.f(cls, "videoView", "getVideoView()Lone/me/sdk/media/player/view/VideoView;", 0, oec)};
    }

    public GifViewerWidget(Bundle bundle) {
        super(bundle, 0, 2, (z84) null);
        this.a = GifViewerWidget.class.getName();
        this.b = new fs(Long.class, 0L, "chat.media.viewer.message_id");
        this.c = new fs(String.class, "", "chat.media.viewer.attach_id");
        fs fsVar = new fs(suc.class, new suc(m81getScopeIdIluPPks()), Widget.ARG_SCOPE_ID);
        bc7 bc7 = u0[2];
        this.o = m82getSharedViewModelcp94BC8(((suc) fsVar.a(this)).a, ck2.class, (k56) null);
        this.X = viewBinding(k8a.h);
        this.Y = viewBinding(k8a.f);
        this.t0 = new rxd(17, this);
    }

    public final String m0() {
        bc7 bc7 = u0[1];
        return (String) this.c.a(this);
    }

    public final long n0() {
        bc7 bc7 = u0[0];
        return ((Number) this.b.a(this)).longValue();
    }

    public final iwa o0() {
        return (iwa) this.X.T0(this, u0[3]);
    }

    public final void onActivityStarted(Activity activity) {
        super.onActivityStarted(activity);
        if (getView() != null && this.s0 != null) {
            q0().a(this.t0);
            dkf p0 = p0();
            if (p0 != null) {
                p0.play();
            }
        }
    }

    public final void onActivityStopped(Activity activity) {
        super.onActivityStopped(activity);
        if (getView() != null && this.s0 != null) {
            dkf p0 = p0();
            if (p0 != null) {
                p0.pause();
                p0.M0((Surface) null);
            }
            q0().b();
        }
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Context context = getContext();
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setLayoutParams(layoutParams);
        iwa iwa = new iwa(frameLayout.getContext());
        iwa.setId(k8a.h);
        iwa.setLayoutParams(new FrameLayout.LayoutParams(-2, -2, 17));
        frameLayout.addView(iwa);
        amf amf = new amf(frameLayout.getContext());
        amf.setId(k8a.f);
        amf.setAlpha(0.0f);
        amf.setLayoutParams(new FrameLayout.LayoutParams(-2, -2, 17));
        this.Z = new cjg(amf);
        frameLayout.addView(amf);
        return frameLayout;
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
        q0().b();
    }

    public final void onViewCreated(View view) {
        sb8 y = r0().y(n0(), m0());
        jb8 jb8 = y instanceof jb8 ? (jb8) y : null;
        if (jb8 != null) {
            o0().setZoomEnabled(false);
            o0().setListener(new qqd(14, (Object) this));
            r0().A(n0(), m0());
            o0().r(jb8.o, false);
            s35 s35 = r0().N0;
            fg7 fg7 = fg7.o;
            od2.L(new zn5(tu0.g(s35, getViewLifecycleOwner().Q(), fg7), new yc6((Continuation) null, this), 5), getViewLifecycleScope());
            od2.L(new zn5(tu0.g(r0().W0, getViewLifecycleOwner().Q(), fg7), new zc6((Continuation) null, this), 5), getViewLifecycleScope());
        }
    }

    public final dkf p0() {
        uu3 targetController = getTargetController();
        dmf dmf = targetController instanceof dmf ? (dmf) targetController : null;
        if (dmf != null) {
            return ((ChatMediaViewerScreen) dmf).B0();
        }
        return null;
    }

    public final amf q0() {
        return (amf) this.Y.T0(this, u0[4]);
    }

    public final ck2 r0() {
        return (ck2) this.o.getValue();
    }

    public GifViewerWidget(long j, String str, String str2, z84 z84) {
        this(dy7.g(new kpa("chat.media.viewer.message_id", Long.valueOf(j)), new kpa("chat.media.viewer.attach_id", str), new kpa(Widget.ARG_SCOPE_ID, new suc(str2))));
    }
}
