package defpackage;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import one.me.profile.ProfileScreen;

/* renamed from: jlb  reason: default package */
public final class jlb extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ ProfileScreen Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public jlb(Continuation continuation, ProfileScreen profileScreen) {
        super(2, continuation);
        this.Y = profileScreen;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((jlb) n(obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        jlb jlb = new jlb(continuation, this.Y);
        jlb.X = obj;
        return jlb;
    }

    public final Object o(Object obj) {
        Object obj2;
        od2.a0(obj);
        wm9 wm9 = (wm9) this.X;
        boolean z = wm9 instanceof ekb;
        e5f e5f = e5f.a;
        if (z) {
            ckb ckb = ckb.c;
            long j = ((ekb) wm9).b;
            f64 P1 = ckb.P1();
            P1.b(":settings/folder/by-chat?id=" + j, (Bundle) null);
        } else if (wm9 instanceof gkb) {
            ckb ckb2 = ckb.c;
            long j2 = ((gkb) wm9).b;
            f64 P12 = ckb2.P1();
            P12.b(":profile/attaches?id=" + j2, (Bundle) null);
        } else if (wm9 instanceof nkb) {
            ckb.c.a2(((nkb) wm9).b);
        } else if (wm9 instanceof qkb) {
            ckb ckb3 = ckb.c;
            long j3 = ((qkb) wm9).b;
            f64 P13 = ckb3.P1();
            y7g y7g = new y7g(13);
            y7g.b = ":chats";
            y7g.D(Long.valueOf(j3), "id");
            y7g.D("local", "type");
            y7g.D("true", "open_search_field");
            P13.c(y7g.r(), (Bundle) null);
        } else if (wm9 instanceof hkb) {
            hkb hkb = (hkb) wm9;
            ckb.c.d2(hkb.b, hkb.c.a);
        } else {
            boolean z2 = wm9 instanceof mkb;
            ProfileScreen profileScreen = this.Y;
            if (z2) {
                mkb mkb = (mkb) wm9;
                ((bt1) profileScreen.C0.getValue()).e(zs1.PROFILE, mkb.d);
                hdb hdb = hdb.CONTACT;
                long j4 = mkb.b;
                hdb hdb2 = mkb.c;
                boolean z3 = mkb.d;
                if (hdb2 == hdb) {
                    profileScreen.n0().l(j4, z3, new by2(wm9, 1));
                } else {
                    String str = mkb.e;
                    if (true ^ (str == null || str.length() == 0)) {
                        rg1 n0 = profileScreen.n0();
                        if (str != null) {
                            n0.j(str, true, z3, false, new by2(wm9, 2));
                        } else {
                            throw new IllegalArgumentException("Required value was null.".toString());
                        }
                    } else if (hdb2 == hdb.SERVER_CHAT) {
                        profileScreen.n0().i(j4, z3, new by2(wm9, 3));
                    }
                }
            } else if (wm9 instanceof jkb) {
                jkb jkb = (jkb) wm9;
                int ordinal = jkb.c.ordinal();
                long j5 = jkb.b;
                if (ordinal == 0) {
                    ckb.c.P1().b(ey8.i(j5, ":profile/edit?id=", "&type=local_chat"), (Bundle) null);
                } else if (ordinal == 1) {
                    ckb.c.P1().b(ey8.i(j5, ":profile/edit?id=", "&type=server_chat"), (Bundle) null);
                } else if (ordinal == 2) {
                    ckb.c.P1().b(ey8.i(j5, ":profile/edit?id=", "&type=contact"), (Bundle) null);
                } else {
                    throw new NoWhenBranchMatchedException();
                }
            } else if (tpa.f(wm9, pkb.b)) {
                bc7[] bc7Arr = ProfileScreen.D0;
                if (profileScreen.getRouter().e().size() == 1) {
                    coc coc = (coc) x53.i0(profileScreen.getRouter().e());
                    if (tpa.f(coc != null ? coc.a : null, profileScreen)) {
                        ckb.c.f2();
                    }
                }
                ckb.c.P1().b(":chat-list", (Bundle) null);
            } else if (wm9 instanceof fkb) {
                String str2 = o37.a;
                String str3 = ((fkb) wm9).b;
                Context context = profileScreen.getContext();
                try {
                    Intent intent = new Intent("android.intent.action.DIAL", Uri.parse("tel:".concat(str3)));
                    intent.setFlags(268435456);
                    context.startActivity(intent);
                    obj2 = e5f;
                } catch (Throwable th) {
                    obj2 = new njc(th);
                }
                Throwable a = pjc.a(obj2);
                if (a != null) {
                    hm9.p(o37.a, "callByPhone: failed", a);
                }
            } else if (wm9 instanceof c64) {
                ckb.c.R1((c64) wm9);
            } else if (wm9 instanceof dkb) {
                ckb ckb4 = ckb.c;
                ((dkb) wm9).getClass();
                ckb4.Z1(0);
            } else if (wm9 instanceof lkb) {
                ckb.c.c2(((lkb) wm9).b);
            } else if (wm9 instanceof ikb) {
                profileScreen.startActivityForResult(((ikb) wm9).b, 666);
            } else if (wm9 instanceof okb) {
                nd7.A(profileScreen.getContext(), ((okb) wm9).b);
            } else if (wm9 instanceof kkb) {
                ckb.c.P1().b(":external_callback", dy7.g(new kpa("params", ((kkb) wm9).b)));
            }
        }
        return e5f;
    }
}
