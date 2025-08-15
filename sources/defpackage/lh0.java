package defpackage;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.view.View;
import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import one.me.chatmedia.viewer.ChatMediaViewerScreen;
import one.me.chats.tab.ChatsTabWidget;
import one.me.keyboardmedia.MediaKeyboardWidget;
import one.me.profile.screens.avatars.ProfileAvatarsScreen;
import one.me.profile.screens.media.ChatMediaTabWidget;

/* renamed from: lh0  reason: default package */
public final class lh0 extends mof {
    public final /* synthetic */ int a;
    public final Object b;

    public lh0() {
        this.a = 5;
        this.b = new ArrayList(3);
    }

    public void a(int i) {
        switch (this.a) {
            case 5:
                try {
                    Iterator it = ((ArrayList) this.b).iterator();
                    while (it.hasNext()) {
                        ((mof) it.next()).a(i);
                    }
                    return;
                } catch (ConcurrentModificationException e) {
                    throw new IllegalStateException("Adding and removing callbacks during dispatch to callbacks is not supported", e);
                }
            case 7:
                ((pz7) this.b).f(false);
                return;
            default:
                return;
        }
    }

    public void b(int i, float f, int i2) {
        switch (this.a) {
            case 5:
                try {
                    Iterator it = ((ArrayList) this.b).iterator();
                    while (it.hasNext()) {
                        ((mof) it.next()).b(i, f, i2);
                    }
                    return;
                } catch (ConcurrentModificationException e) {
                    throw new IllegalStateException("Adding and removing callbacks during dispatch to callbacks is not supported", e);
                }
            default:
                return;
        }
    }

    public final void c(int i) {
        int i2;
        View[] viewArr;
        View[] viewArr2;
        switch (this.a) {
            case 0:
                mh0 mh0 = (mh0) this.b;
                yq3 yq3 = (yq3) mh0.G0.o.f.get(i);
                int c0 = f46.c0(yq3.a);
                switch (au1.s(yq3.a)) {
                    case 0:
                        i2 = 3;
                        break;
                    case 1:
                    case 4:
                    case 6:
                        i2 = 1;
                        break;
                    case 2:
                    case 3:
                    case 5:
                        i2 = 2;
                        break;
                    default:
                        throw new NoWhenBranchMatchedException();
                }
                int i3 = mh0.G0.j() == 1 ? 2 : 1;
                kh0 kh0 = mh0.F0;
                Integer d = ((an9) kh0.c.getValue()).d();
                if (d != null) {
                    int intValue = d.intValue();
                    long F = ((t33) ((q33) kh0.a.getValue())).F();
                    int s = au1.s(i3) + ey8.g(i2, ((au1.s(c0) * 961) + intValue) * 31, 31);
                    int s2 = au1.s(c0);
                    long j = -1;
                    if (s2 == 0) {
                        zh9 zh9 = kh0.e;
                        int b2 = zh9.b(s);
                        if (b2 >= 0) {
                            j = zh9.c[b2];
                        }
                        if (j != F) {
                            zh9.d(s, F);
                        } else {
                            return;
                        }
                    } else if (s2 == 1) {
                        zh9 zh92 = kh0.d;
                        int b3 = zh92.b(s);
                        if (b3 >= 0) {
                            j = zh92.c[b3];
                        }
                        if (j != F) {
                            zh92.d(s, F);
                        } else {
                            return;
                        }
                    } else if (s2 == 2) {
                        zh9 zh93 = kh0.f;
                        int b4 = zh93.b(s);
                        if (b4 >= 0) {
                            j = zh93.c[b4];
                        }
                        if (j != F) {
                            zh93.d(s, F);
                        } else {
                            return;
                        }
                    } else {
                        throw new NoWhenBranchMatchedException();
                    }
                    kh0.b(c0, intValue, i2, i3, F, "showed");
                    return;
                }
                return;
            case 1:
                h71.w((h71) this.b, i);
                return;
            case 2:
                ChatMediaTabWidget chatMediaTabWidget = (ChatMediaTabWidget) this.b;
                an9.g((an9) chatMediaTabWidget.c.getValue(), ChatMediaTabWidget.m0(chatMediaTabWidget));
                return;
            case 3:
                bc7[] bc7Arr = ChatMediaViewerScreen.K0;
                ck2 D0 = ((ChatMediaViewerScreen) this.b).D0();
                D0.a1.o1(D0, ck2.d1[1], j47.S(D0.a, ((w9a) D0.t0).a(), vx3.b, new kj2(D0, i, (Continuation) null)));
                return;
            case 4:
                bc7[] bc7Arr2 = ChatsTabWidget.C0;
                if (((Number) ((ChatsTabWidget) this.b).p0().v0.a.getValue()).intValue() != i) {
                    String str = ((ChatsTabWidget) this.b).b;
                    ir6 ir6 = hm9.m;
                    if (ir6 != null && ir6.c()) {
                        ir6.d(us7.X, str, zr6.h(i, "ONEME-6453|chats_list_lf | tabs page selected, pos:"), (Throwable) null);
                    }
                    spa r0 = ((ChatsTabWidget) this.b).r0();
                    ((an9) ((ChatsTabWidget) this.b).w0.getValue()).f(wuc.CHATS_LIST_TAB, new spa(r0.a, 3, r0.c, r0.d, r0.e));
                    ((ChatsTabWidget) this.b).q0(i);
                }
                ((ChatsTabWidget) this.b).p0().u0.m((Object) null, Integer.valueOf(i));
                return;
            case 5:
                try {
                    Iterator it = ((ArrayList) this.b).iterator();
                    while (it.hasNext()) {
                        ((mof) it.next()).c(i);
                    }
                    return;
                } catch (ConcurrentModificationException e) {
                    throw new IllegalStateException("Adding and removing callbacks during dispatch to callbacks is not supported", e);
                }
            case 6:
                p04 p04 = (p04) this.b;
                znc znc = (znc) p04.s0.get(i);
                int i4 = p04.t0;
                if (i != i4) {
                    znc znc2 = (znc) p04.s0.get(i4);
                    if (znc2 != null) {
                        Iterator it2 = znc2.e().iterator();
                        while (it2.hasNext()) {
                            ((coc) it2.next()).a.setOptionsMenuHidden(true);
                        }
                    }
                    if (znc != null) {
                        Iterator it3 = znc.e().iterator();
                        while (it3.hasNext()) {
                            ((coc) it3.next()).a.setOptionsMenuHidden(false);
                        }
                    }
                    p04.t0 = i;
                    return;
                }
                return;
            case 7:
                ((pz7) this.b).f(false);
                return;
            case 8:
                MediaKeyboardWidget mediaKeyboardWidget = (MediaKeyboardWidget) this.b;
                bd7 bd7 = (bd7) x53.j0(i, (List) mediaKeyboardWidget.w0.a);
                if (bd7 != null) {
                    cc8 cc8 = (cc8) mediaKeyboardWidget.c.getValue();
                    cc8.getClass();
                    pnf.o(cc8.X, new xb8(bd7));
                    bd7 bd72 = bd7.Z;
                    q7c q7c = mediaKeyboardWidget.u0;
                    q7c q7c2 = mediaKeyboardWidget.s0;
                    q7c q7c3 = mediaKeyboardWidget.t0;
                    if (bd7 == bd72) {
                        bc7[] bc7Arr3 = MediaKeyboardWidget.C0;
                        viewArr2 = new View[]{(View) q7c3.T0(mediaKeyboardWidget, bc7Arr3[6])};
                        viewArr = new View[]{(View) q7c2.T0(mediaKeyboardWidget, bc7Arr3[5]), (View) q7c.T0(mediaKeyboardWidget, bc7Arr3[7])};
                    } else {
                        bc7[] bc7Arr4 = MediaKeyboardWidget.C0;
                        viewArr2 = new View[]{(View) q7c2.T0(mediaKeyboardWidget, bc7Arr4[5]), (View) q7c.T0(mediaKeyboardWidget, bc7Arr4[7])};
                        viewArr = new View[]{(View) q7c3.T0(mediaKeyboardWidget, bc7Arr4[6])};
                    }
                    AnimatorSet animatorSet = mediaKeyboardWidget.B0;
                    if (animatorSet != null) {
                        animatorSet.cancel();
                    }
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
                    ofFloat.addUpdateListener(new yl(ofFloat, 4, viewArr2));
                    ValueAnimator ofFloat2 = ValueAnimator.ofFloat(new float[]{1.0f, 0.0f});
                    ofFloat2.addUpdateListener(new yl(ofFloat2, 4, viewArr));
                    AnimatorSet animatorSet2 = new AnimatorSet();
                    animatorSet2.playTogether(new Animator[]{ofFloat, ofFloat2});
                    animatorSet2.addListener(new fh(animatorSet2, new jc8(viewArr2, 0), 1));
                    animatorSet2.addListener(new fh(animatorSet2, new jc8(viewArr, 1), 0));
                    animatorSet2.setDuration(200);
                    animatorSet2.start();
                    mediaKeyboardWidget.B0 = animatorSet2;
                }
                mediaKeyboardWidget.o0().post(new nn6(11, mediaKeyboardWidget));
                return;
            case 9:
                bc7[] bc7Arr5 = ProfileAvatarsScreen.z0;
                ProfileAvatarsScreen profileAvatarsScreen = (ProfileAvatarsScreen) this.b;
                ProfileAvatarsScreen.w0(profileAvatarsScreen, profileAvatarsScreen.B0().b.getTitle(), i);
                return;
            default:
                p04 p042 = (p04) this.b;
                znc znc3 = (znc) p042.s0.get(i);
                int i5 = p042.t0;
                if (i != i5) {
                    znc znc4 = (znc) p042.s0.get(i5);
                    if (znc4 != null) {
                        Iterator it4 = znc4.e().iterator();
                        while (it4.hasNext()) {
                            ((coc) it4.next()).a.setOptionsMenuHidden(true);
                        }
                    }
                    if (znc3 != null) {
                        Iterator it5 = znc3.e().iterator();
                        while (it5.hasNext()) {
                            ((coc) it5.next()).a.setOptionsMenuHidden(false);
                        }
                    }
                    p042.t0 = i;
                    return;
                }
                return;
        }
    }

    public /* synthetic */ lh0(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }
}
