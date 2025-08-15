package defpackage;

import android.app.Activity;
import android.graphics.Point;
import android.view.View;
import android.view.WindowInsets;
import java.util.Collections;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import one.me.chatscreen.ChatScreen;
import one.me.sdk.messagewrite.MessageWriteWidget;
import ru.ok.android.externcalls.sdk.audio.internal.impl3.CallsAudioManagerV3Impl;

/* renamed from: yn2  reason: default package */
public final class yn2 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ ChatScreen Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public yn2(Continuation continuation, ChatScreen chatScreen) {
        super(2, continuation);
        this.Y = chatScreen;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((yn2) n(obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        yn2 yn2 = new yn2(continuation, this.Y);
        yn2.X = obj;
        return yn2;
    }

    public final Object o(Object obj) {
        View videoMessageRecordAnchor;
        Activity d;
        od2.a0(obj);
        iac iac = (iac) this.X;
        boolean z = iac instanceof dac;
        cz5 cz5 = null;
        ChatScreen chatScreen = this.Y;
        if (z) {
            dac dac = (dac) iac;
            o2 o2Var = dac.a;
            if (o2Var instanceof fif) {
                bc7[] bc7Arr = ChatScreen.k1;
                rq2 P0 = chatScreen.P0();
                fif fif = (fif) o2Var;
                Long w = chatScreen.F0().w();
                zy8 v = chatScreen.F0().v();
                cz5 a = v != null ? v.a() : null;
                e52 e52 = (e52) P0.Y0.a.getValue();
                if (e52 != null) {
                    P0.C(pnf.n(P0, (lx3) null, vx3.b, new dq2(P0, e52.a, fif, w, a, (Continuation) null), 1));
                }
            } else if (o2Var instanceof j50) {
                bc7[] bc7Arr2 = ChatScreen.k1;
                rq2 P02 = chatScreen.P0();
                List singletonList = Collections.singletonList(dac.a);
                Long w2 = chatScreen.F0().w();
                zy8 v2 = chatScreen.F0().v();
                if (v2 != null) {
                    cz5 = v2.a();
                }
                P02.B((CharSequence) null, singletonList, false, w2, cz5);
                xx6 xx6 = (xx6) chatScreen.h1.getValue();
                if (xx6 != null) {
                    xx6.f(Collections.singleton(new wx6(ux6.SEND_AUDIO_MESSAGE, 1)), wuc.CHAT);
                }
            }
        } else if (iac instanceof gac) {
            ChatScreen.U0(chatScreen, (Integer) null, String.valueOf(((gac) iac).a.b(chatScreen.getContext())), (Integer) null, (Integer) null, 13);
        } else if (iac instanceof fac) {
            vo2 vo2 = vo2.c;
            if (!vo2.P1().d() && (d = ((haa) vo2.P1().a()).f().C().d()) != null) {
                d.finish();
            }
        } else if (iac instanceof hac) {
            bc7[] bc7Arr3 = ChatScreen.k1;
            MessageWriteWidget G0 = chatScreen.G0();
            if (G0 != null) {
                hac hac = (hac) iac;
                int[] iArr = new int[2];
                int ordinal = hac.a.ordinal();
                if (ordinal == 0) {
                    videoMessageRecordAnchor = G0.q0().getVideoMessageRecordAnchor();
                } else if (ordinal == 1) {
                    videoMessageRecordAnchor = G0.q0().getAudioRecordAnchor();
                } else {
                    throw new NoWhenBranchMatchedException();
                }
                View view = videoMessageRecordAnchor;
                if (view != null) {
                    view.getLocationOnScreen(iArr);
                    int q = rh4.q((float) 18, fk4.d().getDisplayMetrics().density, (br7.D(G0.getContext()) - iArr[0]) - (view.getWidth() / 2));
                    WindowInsets rootWindowInsets = G0.requireView().getRootWindowInsets();
                    int i = rootWindowInsets != null ? x6g.f((View) null, rootWindowInsets).a.f(7).d : 0;
                    int i2 = vc7.a;
                    Point point = new Point(q, (G0.q0().getHeight() - tu0.G(((float) 8) * fk4.d().getDisplayMetrics().density)) + i + (vc7.b(vc7.c) ? vc7.a(G0.getContext()) : 0));
                    ywe ywe = G0.D0;
                    if (ywe == null || !ywe.isShowing()) {
                        ywe ywe2 = G0.D0;
                        if (ywe2 != null) {
                            ywe2.dismiss();
                        }
                        ywe ywe3 = new ywe(G0.getContext(), view, (k56) new yz8(G0, 2), (k56) null, 2, 3, 8);
                        ywe3.d(hac.b);
                        ywe3.e(point, 8388693, CallsAudioManagerV3Impl.USED_DEVICE_RECOVER_TIMEOUT_MS);
                        ywe3.setOnDismissListener(new c09(G0, 0));
                        G0.D0 = ywe3;
                    } else {
                        ywe ywe4 = G0.D0;
                        if (ywe4 != null) {
                            ywe4.e(point, 8388693, CallsAudioManagerV3Impl.USED_DEVICE_RECOVER_TIMEOUT_MS);
                        }
                    }
                }
            }
        } else if (iac instanceof eac) {
            eac eac = (eac) iac;
            int ordinal2 = eac.a.ordinal();
            boolean z2 = eac.b;
            if (ordinal2 == 0) {
                bc7[] bc7Arr4 = ChatScreen.k1;
                rq2 P03 = chatScreen.P0();
                e52 e522 = (e52) P03.Y0.a.getValue();
                if (e522 != null) {
                    long j = e522.b.a;
                    je7 je7 = P03.I0;
                    if (z2) {
                        sna sna = (sna) je7.getValue();
                        sna.getClass();
                        if (j != 0) {
                            sna.f(j, b10.VIDEO_MSG, -2);
                        }
                    } else {
                        sna sna2 = (sna) je7.getValue();
                        if (j == 0) {
                            sna2.getClass();
                        } else {
                            sna2.getClass();
                            sna.b(j, -2);
                        }
                    }
                }
            } else if (ordinal2 == 1) {
                bc7[] bc7Arr5 = ChatScreen.k1;
                rq2 P04 = chatScreen.P0();
                e52 e523 = (e52) P04.Y0.a.getValue();
                if (e523 != null) {
                    long j2 = e523.b.a;
                    je7 je72 = P04.I0;
                    if (z2) {
                        sna sna3 = (sna) je72.getValue();
                        sna3.getClass();
                        if (j2 != 0) {
                            sna3.f(j2, b10.AUDIO, -1);
                        }
                    } else {
                        sna sna4 = (sna) je72.getValue();
                        if (j2 == 0) {
                            sna4.getClass();
                        } else {
                            sna4.getClass();
                            sna.b(j2, -1);
                        }
                    }
                }
            } else {
                throw new NoWhenBranchMatchedException();
            }
        } else {
            throw new NoWhenBranchMatchedException();
        }
        return e5f.a;
    }
}
