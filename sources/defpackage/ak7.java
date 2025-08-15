package defpackage;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import one.me.android.MainActivity;
import one.me.android.deeplink.LinkInterceptorWidget;
import one.me.android.join.JoinChatWidget;
import one.me.sdk.arch.Widget;

/* renamed from: ak7  reason: default package */
public final class ak7 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ LinkInterceptorWidget Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ak7(LinkInterceptorWidget linkInterceptorWidget, Continuation continuation) {
        super(2, continuation);
        this.Y = linkInterceptorWidget;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((ak7) n((ej7) obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        ak7 ak7 = new ak7(this.Y, continuation);
        ak7.X = obj;
        return ak7;
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        ej7 ej7 = (ej7) this.X;
        int i = LinkInterceptorWidget.o;
        LinkInterceptorWidget linkInterceptorWidget = this.Y;
        im requireActivity = linkInterceptorWidget.requireActivity();
        boolean z = !(requireActivity instanceof nmc);
        String m = ej7.m();
        q12 q12 = new q12(m, 2);
        if (ej7.equals(vi7.a)) {
            wha wha = new wha((Widget) linkInterceptorWidget);
            wha.b = new uia(nia.a, "Ждите", "ждите", new eia(2, 0, 0, 6));
            wha.i();
        } else if (ej7 instanceof oi7) {
            uia uia = new uia(new kia(woc.g1), z7.B(linkInterceptorWidget.getContext(), yzb.snackbar_link_info_error), (String) null, new eia(2, 0, 0, 6));
            if (z) {
                int i2 = MainActivity.a1;
                hx9.t(requireActivity, (Uri) null, uia, (q12) null, 10);
                requireActivity.finish();
            } else {
                wha wha2 = new wha((Widget) linkInterceptorWidget);
                wha2.b = uia;
                wha2.i();
            }
        } else if (ej7 instanceof ri7) {
            if (z) {
                int i3 = MainActivity.a1;
                hx9.t(requireActivity, (Uri) null, (uia) null, (q12) null, 14);
                requireActivity.finish();
            } else {
                vw7.c.getClass();
                vw7.a2((String) null, false);
            }
        } else if (ej7 instanceof si7) {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setData(((si7) ej7).a);
            linkInterceptorWidget.startActivity(intent);
        } else if (ej7 instanceof ni7) {
            if (z) {
                znc router = linkInterceptorWidget.getRouter();
                ni7 ni7 = (ni7) ej7;
                coc e = i24.e(new JoinChatWidget(ni7.a, ni7.o, ni7.b, ni7.c), (zu3) null, (zu3) null);
                e.d("join_chat");
                router.R(e);
            } else {
                ni7 ni72 = (ni7) ej7;
                f64 P1 = i97.c.P1();
                y7g y7g = new y7g(13);
                y7g.b = ":join";
                y7g.D(Long.valueOf(ni72.a), "id");
                y7g.D(ni72.o, "link");
                y7g.D(Boolean.valueOf(ni72.c), "channel");
                y7g.D(Boolean.TRUE, "no_anim");
                String str = ni72.b;
                if (str != null) {
                    y7g.D(str, "title");
                }
                P1.c(y7g.r(), (Bundle) null);
            }
        } else if (ej7 instanceof wi7) {
            if (z) {
                int i4 = MainActivity.a1;
                gy2 gy2 = gy2.c;
                wi7 wi7 = (wi7) ej7;
                Long l = new Long(wi7.b);
                hx9.t(requireActivity, gy2.Z1(gy2, wi7.a, "local", (Long) null, l.longValue() > 0 ? l : null, (List) null, (String) null, (Boolean) null, true, 244), (uia) null, q12, 4);
                requireActivity.finish();
            } else {
                gy2 gy22 = gy2.c;
                wi7 wi72 = (wi7) ej7;
                Long l2 = new Long(wi72.b);
                gy2.b2(gy22, wi72.a, "local", (Long) null, l2.longValue() > 0 ? l2 : null, (List) null, (String) null, 116);
            }
        } else if (ej7 instanceof xi7) {
            if (z) {
                int i5 = MainActivity.a1;
                ckb.c.getClass();
                y7g y7g2 = new y7g(13);
                y7g2.b = ":profile";
                y7g2.D(Long.valueOf(((xi7) ej7).a), "id");
                y7g2.D("contact", "type");
                hx9.t(requireActivity, y7g2.r(), (uia) null, q12, 4);
                requireActivity.finish();
            } else {
                ckb.c.e2(((xi7) ej7).a);
            }
        } else if (ej7 instanceof yi7) {
            if (z) {
                int i6 = MainActivity.a1;
                yi7 yi7 = (yi7) ej7;
                hx9.t(requireActivity, gy2.Z1(gy2.c, yi7.a, "local", (Long) null, (Long) null, (List) null, yi7.b, (Boolean) null, false, 476), (uia) null, q12, 4);
                requireActivity.finish();
            } else {
                yi7 yi72 = (yi7) ej7;
                gy2.b2(gy2.c, yi72.a, "local", (Long) null, (Long) null, (List) null, yi72.b, 92);
            }
        } else if (ej7 instanceof bj7) {
            if (z) {
                int i7 = MainActivity.a1;
                gy2.c.getClass();
                y7g y7g3 = new y7g(13);
                y7g3.b = ":stickers/set";
                y7g3.D(Long.valueOf(((bj7) ej7).a), "set_id");
                hx9.t(requireActivity, y7g3.r(), (uia) null, (q12) null, 12);
                requireActivity.finish();
            } else {
                f64 P12 = gy2.c.P1();
                y7g y7g4 = new y7g(13);
                y7g4.b = ":stickers/set";
                y7g4.D(Long.valueOf(((bj7) ej7).a), "set_id");
                P12.c(y7g4.r(), (Bundle) null);
            }
        } else if (ej7 instanceof aj7) {
            je7 je7 = linkInterceptorWidget.b;
            if (z) {
                rg1 rg1 = (rg1) je7.getValue();
                aj7 aj7 = (aj7) ej7;
                rg1.c();
                if (((Boolean) rg1.n.getValue()).booleanValue()) {
                    String str2 = aj7.a;
                    if (!w9e.C0(str2)) {
                        if (!((wr1) rg1.d()).f(new hyd(str2, true))) {
                            sg1.c.getClass();
                            y7g y7g5 = new y7g(13);
                            y7g5.b = ":call-active";
                            Uri r = y7g5.r();
                            int i8 = MainActivity.a1;
                            hx9.t(requireActivity, r, (uia) null, (q12) null, 12);
                        } else {
                            sg1.c.getClass();
                            y7g y7g6 = new y7g(13);
                            y7g6.b = ":call-join-preview";
                            y7g6.D(str2, "link");
                            Uri r2 = y7g6.r();
                            int i9 = MainActivity.a1;
                            hx9.t(requireActivity, r2, (uia) null, (q12) null, 12);
                        }
                        requireActivity.finish();
                    }
                }
                rg1.a.a();
                requireActivity.finish();
            } else {
                ((rg1) je7.getValue()).j(((aj7) ej7).a, true, false, false, new zj7(0, ej7));
            }
        } else {
            boolean equals = ej7.equals(qi7.a);
            lia lia = lia.a;
            if (equals) {
                uia uia2 = new uia(lia, z7.B(linkInterceptorWidget.getContext(), yzb.snackbar_self_contact_open), (String) null, new eia(2, 0, 0, 6));
                if (z) {
                    int i10 = MainActivity.a1;
                    hx9.t(requireActivity, (Uri) null, uia2, (q12) null, 10);
                    requireActivity.finish();
                } else {
                    wha wha3 = new wha((Widget) linkInterceptorWidget);
                    wha3.b = uia2;
                    wha3.i();
                }
            } else if (ej7 instanceof pi7) {
                if (z) {
                    int i11 = MainActivity.a1;
                    hx9.t(requireActivity, ((pi7) ej7).a, (uia) null, q12, 4);
                    requireActivity.finish();
                } else {
                    ((f64) y8a.a.getAccessor().c(f64.class)).c(((pi7) ej7).a, (Bundle) null);
                }
            } else if (ej7.equals(zi7.a)) {
                uia uia3 = new uia(lia, z7.B(linkInterceptorWidget.getContext(), yzb.snackbar_contact_removed), (String) null, new eia(2, 0, 0, 6));
                if (z) {
                    int i12 = MainActivity.a1;
                    hx9.t(requireActivity, (Uri) null, uia3, (q12) null, 10);
                    requireActivity.finish();
                } else {
                    wha wha4 = new wha((Widget) linkInterceptorWidget);
                    wha4.b = uia3;
                    wha4.i();
                }
            } else if (ej7 instanceof ti7) {
                if (z) {
                    int i13 = MainActivity.a1;
                    vw7.c.getClass();
                    y7g y7g7 = new y7g(13);
                    y7g7.b = ":chat-list";
                    y7g7.D(Boolean.FALSE, "message_push");
                    String str3 = ((ti7) ej7).a;
                    if (str3 != null) {
                        y7g7.D(str3, "folder_id");
                    }
                    hx9.t(requireActivity, y7g7.r(), (uia) null, (q12) null, 12);
                    requireActivity.finish();
                } else {
                    vw7.c.getClass();
                    vw7.a2(((ti7) ej7).a, false);
                }
            } else if (ej7 instanceof dj7) {
                uia uia4 = new uia(lia, z7.B(linkInterceptorWidget.getContext(), yzb.snackbar_folder_link_error_title), z7.B(linkInterceptorWidget.getContext(), yzb.snackbar_folder_link_error_caption), new eia(2, 0, 0, 6));
                if (z) {
                    int i14 = MainActivity.a1;
                    hx9.t(requireActivity, (Uri) null, uia4, (q12) null, 10);
                    requireActivity.finish();
                } else {
                    wha wha5 = new wha((Widget) linkInterceptorWidget);
                    wha5.b = uia4;
                    wha5.i();
                }
            } else if (!(ej7 instanceof ui7)) {
                throw new NoWhenBranchMatchedException();
            } else if (z) {
                int i15 = MainActivity.a1;
                vw7 vw7 = vw7.c;
                ui7 ui7 = (ui7) ej7;
                b46 b46 = osf.c;
                vw7.getClass();
                hx9.t(requireActivity, vw7.b2(ui7.a, ui7.b), (uia) null, (q12) null, 12);
                requireActivity.finish();
            } else {
                vw7 vw72 = vw7.c;
                ui7 ui72 = (ui7) ej7;
                b46 b462 = osf.c;
                vw72.P1().c(vw7.b2(ui72.a, ui72.b), (Bundle) null);
            }
        }
        if (!z && m != null) {
            vw7.c.P1().b(":external_callback", dy7.g(new kpa("params", m)));
        }
        return e5f.a;
    }
}
