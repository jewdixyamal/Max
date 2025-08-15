package defpackage;

import kotlin.coroutines.Continuation;
import ru.ok.tamtam.android.prefs.PmsKey;

/* renamed from: zv2  reason: default package */
public final class zv2 extends ffe implements a66 {
    public int X;
    public final /* synthetic */ int Y;
    public final /* synthetic */ gw2 Z;
    public final /* synthetic */ long s0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zv2(int i, gw2 gw2, long j, Continuation continuation) {
        super(2, continuation);
        this.Y = i;
        this.Z = gw2;
        this.s0 = j;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((zv2) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new zv2(this.Y, this.Z, this.s0, continuation);
    }

    public final Object o(Object obj) {
        int i;
        uj3 l;
        tx3 tx3 = tx3.a;
        int i2 = this.X;
        e5f e5f = e5f.a;
        if (i2 == 0) {
            od2.a0(obj);
            int i3 = uvb.oneme_chat_action_add_to_folder;
            gw2 gw2 = this.Z;
            long j = this.s0;
            int i4 = this.Y;
            if (i4 == i3 || i4 == (i = uvb.oneme_chat_action_remove_from_folder)) {
                bc7[] bc7Arr = gw2.Q0;
                e52 e52 = (e52) ((jz2) gw2.s()).m(j).a.getValue();
                if (e52 == null) {
                    return e5f;
                }
                pnf.o(gw2.H0, new vla(e52.b.a));
            } else if (i4 == i) {
                pnf.o(gw2.H0, new vla(j));
            } else if (i4 == uvb.oneme_chat_action_delete_channel) {
                bc7[] bc7Arr2 = gw2.Q0;
                e52 e522 = (e52) ((jz2) gw2.s()).m(j).a.getValue();
                if (e522 == null) {
                    return e5f;
                }
                pnf.o(gw2.I0, e522.c() ? h52.d(e522) : h52.e(e522));
            } else if (i4 == uvb.oneme_chat_action_delete_chat) {
                bc7[] bc7Arr3 = gw2.Q0;
                e52 e523 = (e52) ((jz2) gw2.s()).m(j).a.getValue();
                if (e523 == null) {
                    return e5f;
                }
                pnf.o(gw2.I0, e523.M() ? h52.g(e523) : e523.c() ? h52.f(e523) : h52.e(e523));
            } else if (i4 == uvb.oneme_chat_action_leave) {
                bc7[] bc7Arr4 = gw2.Q0;
                e52 e524 = (e52) ((jz2) gw2.s()).m(j).a.getValue();
                if (e524 == null) {
                    return e5f;
                }
                pnf.o(gw2.I0, e524.c() ? e524.I() ? h52.i(e524) : h52.k(e524) : e524.I() ? h52.h(e524) : h52.j(e524));
            } else if (i4 == uvb.oneme_chat_action_close_chat) {
                pnf.o(gw2.I0, h52.c(j));
            } else if (i4 == uvb.oneme_chat_action_close_channel) {
                pnf.o(gw2.I0, h52.b(j));
            } else if (i4 == uvb.oneme_chat_action_block) {
                bc7[] bc7Arr5 = gw2.Q0;
                e52 e525 = (e52) ((jz2) gw2.s()).m(j).a.getValue();
                if ((e525 != null ? e525.l() : null) != null) {
                    pnf.o(gw2.I0, h52.a(e525));
                }
            } else if (i4 == uvb.oneme_chat_action_add_favorite) {
                bc7[] bc7Arr6 = gw2.Q0;
                qyc qyc = (qyc) ((y7d) gw2.u0.getValue());
                qyc.getClass();
                int q = (int) qyc.q(PmsKey.f68maxfavoritechats, (long) 5);
                int G = ((jz2) gw2.s()).l().G();
                s35 s35 = gw2.I0;
                if (G < q) {
                    p82 l2 = ((jz2) gw2.s()).l();
                    l2.getClass();
                    hm9.m("p82", "addToFavorites: " + j, new Object[0]);
                    l2.Z(j, System.currentTimeMillis(), true);
                    pnf.o(s35, new Object());
                } else {
                    pnf.o(s35, new rnd(new gqe(jpc.b0, ys.m0(new Object[]{new Integer(q)}))));
                }
            } else if (i4 == uvb.oneme_chat_action_remove_favorite) {
                bc7[] bc7Arr7 = gw2.Q0;
                ((jz2) gw2.s()).l().V(j, true);
            } else if (i4 == uvb.oneme_chat_action_mark_as_unread) {
                bc7[] bc7Arr8 = gw2.Q0;
                e52 e526 = (e52) ((jz2) gw2.s()).m(j).a.getValue();
                if (e526 == null) {
                    return e5f;
                }
                p7c p7c = (p7c) gw2.z0.getValue();
                e52 z = p7c.a().z(e526.b.a);
                if (z != null) {
                    p7c.c(z);
                }
            } else if (i4 == uvb.oneme_chat_action_mark_as_read) {
                bc7[] bc7Arr9 = gw2.Q0;
                e52 e527 = (e52) ((jz2) gw2.s()).m(j).a.getValue();
                if (e527 == null) {
                    return e5f;
                }
                ((p7c) gw2.z0.getValue()).b(e527);
            } else if (i4 == uvb.oneme_chat_action_unmute) {
                bc7[] bc7Arr10 = gw2.Q0;
                ((jz2) gw2.s()).l().g0(j);
            } else if (i4 == uvb.oneme_chat_action_mute) {
                bc7[] bc7Arr11 = gw2.Q0;
                e52 e528 = (e52) ((jz2) gw2.s()).m(j).a.getValue();
                if (e528 == null) {
                    return e5f;
                }
                pnf.o(gw2.I0, h52.l(e528));
            } else if (i4 == uvb.oneme_chat_action_select) {
                pnf.o(gw2.I0, h52.m());
            } else if (i4 == uvb.oneme_chat_action_move_rights_and_leave) {
                bc7[] bc7Arr12 = gw2.Q0;
                e52 e529 = (e52) ((jz2) gw2.s()).m(j).a.getValue();
                if (e529 == null) {
                    return e5f;
                }
                boolean I = e529.I();
                s35 s352 = gw2.H0;
                if (I) {
                    pnf.o(s352, new yc9(j));
                } else {
                    gy2.c.getClass();
                    wg0.k(":profile/change-owner?chat_id=" + j + "&leave_chat=true", s352);
                }
            } else {
                int i5 = uvb.oneme_confirm_delete;
                long j2 = this.s0;
                if (i4 == i5) {
                    zfc.a((zfc) gw2.s0.getValue(), j2);
                } else if (i4 == uvb.oneme_confirm_delete_for_all) {
                    zfc.a((zfc) gw2.s0.getValue(), j2);
                } else if (i4 == uvb.oneme_confirm_leave) {
                    bc7[] bc7Arr13 = gw2.Q0;
                    ((jz2) gw2.s()).l().Q(j);
                } else if (i4 == uvb.oneme_confirm_block) {
                    bc7[] bc7Arr14 = gw2.Q0;
                    e52 e5210 = (e52) ((jz2) gw2.s()).m(j).a.getValue();
                    if (e5210 == null || (l = e5210.l()) == null) {
                        return e5f;
                    }
                    long n = l.n();
                    this.X = 1;
                    ((ck3) gw2.A0.getValue()).a(n);
                    if (e5f == tx3) {
                        return tx3;
                    }
                } else if (i4 == uvb.oneme_confirm_mute_1_hour) {
                    int i6 = ft4.o;
                    long R = z7.R(1, kt4.HOURS);
                    this.X = 2;
                    gw2.q(gw2, j2, R);
                    if (e5f == tx3) {
                        return tx3;
                    }
                } else if (i4 == uvb.oneme_confirm_mute_4_hour) {
                    int i7 = ft4.o;
                    long R2 = z7.R(4, kt4.HOURS);
                    this.X = 3;
                    gw2.q(gw2, j2, R2);
                    if (e5f == tx3) {
                        return tx3;
                    }
                } else if (i4 == uvb.oneme_confirm_mute_1_day) {
                    int i8 = ft4.o;
                    long R3 = z7.R(1, kt4.DAYS);
                    this.X = 4;
                    gw2.q(gw2, j2, R3);
                    if (e5f == tx3) {
                        return tx3;
                    }
                } else if (i4 == uvb.oneme_confirm_mute_infinite) {
                    this.X = 5;
                    bc7[] bc7Arr15 = gw2.Q0;
                    p82 l3 = ((jz2) gw2.s()).l();
                    e52 C = l3.C(j);
                    if (C != null) {
                        l3.l(-1, C);
                        ((k4a) ((pk) l3.p.get())).r(C.a);
                    }
                    if (e5f == tx3) {
                        return tx3;
                    }
                }
            }
        } else if (i2 == 1 || i2 == 2 || i2 == 3 || i2 == 4 || i2 == 5) {
            od2.a0(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return e5f;
    }
}
