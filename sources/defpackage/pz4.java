package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.WeakHashMap;
import one.me.chats.search.ChatsListSearchScreen;
import one.me.sdk.lists.widgets.EmptyRecyclerView;
import one.me.sdk.lists.widgets.EndlessRecyclerView2;
import ru.ok.tamtam.stickers.view.RecyclerAutofitGridView;

/* renamed from: pz4  reason: default package */
public final class pz4 extends jdc {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ pz4(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public void a() {
        switch (this.a) {
            case 0:
                ((EmptyRecyclerView) this.b).F0();
                return;
            case 2:
                ((pz7) this.b).f(true);
                return;
            case 3:
                ((ng6) this.b).a();
                return;
            case 4:
                cn9 cn9 = (cn9) this.b;
                cn9.e = cn9.c.j();
                od3 od3 = cn9.d;
                ((nd3) od3.e).m();
                od3.c();
                return;
            case 5:
                ((RecyclerAutofitGridView) this.b).F0();
                return;
            case 6:
                RecyclerView recyclerView = (RecyclerView) this.b;
                recyclerView.n((String) null);
                recyclerView.s1.g = true;
                recyclerView.k0(true);
                if (!recyclerView.s0.D()) {
                    recyclerView.requestLayout();
                    return;
                }
                return;
            case 8:
                ((xu3) this.b).s();
                return;
            default:
                return;
        }
    }

    public void b(int i, int i2) {
        switch (this.a) {
            case 2:
                a();
                return;
            case 3:
                ((ng6) this.b).a();
                return;
            case 4:
                cn9 cn9 = (cn9) this.b;
                od3 od3 = cn9.d;
                ((nd3) od3.e).o(i + od3.d(cn9), i2, (Object) null);
                return;
            case 7:
                ((k56) this.b).invoke();
                return;
            case 8:
                ((xu3) this.b).s();
                return;
            default:
                return;
        }
    }

    public void c(int i, int i2, Object obj) {
        switch (this.a) {
            case 2:
                a();
                return;
            case 3:
                ((ng6) this.b).a();
                return;
            case 4:
                cn9 cn9 = (cn9) this.b;
                od3 od3 = cn9.d;
                ((nd3) od3.e).o(i + od3.d(cn9), i2, obj);
                return;
            case 6:
                RecyclerView recyclerView = (RecyclerView) this.b;
                recyclerView.n((String) null);
                x8 x8Var = recyclerView.s0;
                if (i2 < 1) {
                    x8Var.getClass();
                    return;
                }
                ArrayList arrayList = (ArrayList) x8Var.c;
                arrayList.add(x8Var.G(obj, 4, i, i2));
                x8Var.a |= 4;
                if (arrayList.size() == 1) {
                    h();
                    return;
                }
                return;
            case 7:
                ((k56) this.b).invoke();
                return;
            case 8:
                ((xu3) this.b).s();
                return;
            default:
                super.c(i, i2, obj);
                return;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00b2, code lost:
        if (r5.s != null) goto L_0x00b6;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void d(int r6, int r7) {
        /*
            r5 = this;
            r0 = 1
            r1 = 0
            int r2 = r5.a
            switch(r2) {
                case 0: goto L_0x00ba;
                case 1: goto L_0x0073;
                case 2: goto L_0x006f;
                case 3: goto L_0x0067;
                case 4: goto L_0x0041;
                case 5: goto L_0x0007;
                case 6: goto L_0x0018;
                case 7: goto L_0x0010;
                case 8: goto L_0x0008;
                default: goto L_0x0007;
            }
        L_0x0007:
            return
        L_0x0008:
            java.lang.Object r5 = r5.b
            xu3 r5 = (defpackage.xu3) r5
            r5.s()
            return
        L_0x0010:
            java.lang.Object r5 = r5.b
            k56 r5 = (defpackage.k56) r5
            r5.invoke()
            return
        L_0x0018:
            java.lang.Object r2 = r5.b
            androidx.recyclerview.widget.RecyclerView r2 = (androidx.recyclerview.widget.RecyclerView) r2
            r2.n(r1)
            x8 r2 = r2.s0
            if (r7 >= r0) goto L_0x0027
            r2.getClass()
            goto L_0x0040
        L_0x0027:
            java.lang.Object r3 = r2.c
            java.util.ArrayList r3 = (java.util.ArrayList) r3
            w8 r6 = r2.G(r1, r0, r6, r7)
            r3.add(r6)
            int r6 = r2.a
            r6 = r6 | r0
            r2.a = r6
            int r6 = r3.size()
            if (r6 != r0) goto L_0x0040
            r5.h()
        L_0x0040:
            return
        L_0x0041:
            java.lang.Object r5 = r5.b
            cn9 r5 = (defpackage.cn9) r5
            int r0 = r5.e
            int r0 = r0 + r7
            r5.e = r0
            od3 r0 = r5.d
            int r1 = r0.d(r5)
            java.lang.Object r2 = r0.e
            nd3 r2 = (defpackage.nd3) r2
            int r6 = r6 + r1
            r2.p(r6, r7)
            int r6 = r5.e
            if (r6 <= 0) goto L_0x0066
            hdc r5 = r5.c
            int r5 = r5.c
            r6 = 2
            if (r5 != r6) goto L_0x0066
            r0.c()
        L_0x0066:
            return
        L_0x0067:
            java.lang.Object r5 = r5.b
            ng6 r5 = (defpackage.ng6) r5
            r5.a()
            return
        L_0x006f:
            r5.a()
            return
        L_0x0073:
            bc7[] r6 = one.me.chats.search.ChatsListSearchScreen.J0
            java.lang.Object r5 = r5.b
            one.me.chats.search.ChatsListSearchScreen r5 = (one.me.chats.search.ChatsListSearchScreen) r5
            gw2 r6 = r5.n0()
            w7c r6 = r6.F0
            j0e r6 = r6.a
            java.lang.Object r6 = r6.getValue()
            ov2 r6 = (defpackage.ov2) r6
            java.util.List r6 = r6.d
            int r6 = r6.size()
            if (r6 != r7) goto L_0x0092
            r5.q0()
        L_0x0092:
            bc7[] r6 = one.me.chats.search.ChatsListSearchScreen.J0
            r1 = 3
            r6 = r6[r1]
            q7c r1 = r5.G0
            java.lang.Object r6 = r1.T0(r5, r6)
            one.me.sdk.lists.widgets.EndlessRecyclerView2 r6 = (one.me.sdk.lists.widgets.EndlessRecyclerView2) r6
            if (r7 <= 0) goto L_0x00b5
            gw2 r5 = r5.n0()
            yx7 r5 = r5.o
            iq1 r7 = r5.l
            boolean r7 = defpackage.cqc.c(r7)
            if (r7 != 0) goto L_0x00b0
            goto L_0x00b6
        L_0x00b0:
            java.lang.String r5 = r5.s
            if (r5 == 0) goto L_0x00b5
            goto L_0x00b6
        L_0x00b5:
            r0 = 0
        L_0x00b6:
            r6.setRefreshingNext(r0)
            return
        L_0x00ba:
            java.lang.Class<pz4> r6 = defpackage.pz4.class
            java.lang.String r7 = r6.getName()
            java.lang.Object r0 = r5.b
            one.me.sdk.lists.widgets.EmptyRecyclerView r0 = (one.me.sdk.lists.widgets.EmptyRecyclerView) r0
            ir6 r2 = defpackage.hm9.m
            if (r2 != 0) goto L_0x00c9
            goto L_0x00de
        L_0x00c9:
            boolean r3 = r2.c()
            if (r3 == 0) goto L_0x00de
            us7 r3 = defpackage.us7.X
            boolean r0 = r0.Z()
            java.lang.String r4 = "onItemRangeInserted start. isComputingLayout:"
            java.lang.String r0 = defpackage.ey8.j(r4, r0)
            r2.d(r3, r7, r0, r1)
        L_0x00de:
            java.lang.Object r7 = r5.b
            one.me.sdk.lists.widgets.EmptyRecyclerView r7 = (one.me.sdk.lists.widgets.EmptyRecyclerView) r7
            r7.F0()
            java.lang.String r6 = r6.getName()
            java.lang.Object r5 = r5.b
            one.me.sdk.lists.widgets.EmptyRecyclerView r5 = (one.me.sdk.lists.widgets.EmptyRecyclerView) r5
            ir6 r7 = defpackage.hm9.m
            if (r7 != 0) goto L_0x00f2
            goto L_0x0107
        L_0x00f2:
            boolean r0 = r7.c()
            if (r0 == 0) goto L_0x0107
            us7 r0 = defpackage.us7.X
            boolean r5 = r5.Z()
            java.lang.String r2 = "onItemRangeInserted end. isComputingLayout:"
            java.lang.String r5 = defpackage.ey8.j(r2, r5)
            r7.d(r0, r6, r5, r1)
        L_0x0107:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pz4.d(int, int):void");
    }

    public void e(int i, int i2) {
        switch (this.a) {
            case 2:
                a();
                return;
            case 3:
                ((ng6) this.b).a();
                return;
            case 4:
                cn9 cn9 = (cn9) this.b;
                od3 od3 = cn9.d;
                int d = od3.d(cn9);
                ((nd3) od3.e).n(i + d, i2 + d);
                return;
            case 6:
                RecyclerView recyclerView = (RecyclerView) this.b;
                recyclerView.n((String) null);
                x8 x8Var = recyclerView.s0;
                x8Var.getClass();
                if (i != i2) {
                    ArrayList arrayList = (ArrayList) x8Var.c;
                    arrayList.add(x8Var.G((Object) null, 8, i, i2));
                    x8Var.a |= 8;
                    if (arrayList.size() == 1) {
                        h();
                        return;
                    }
                    return;
                }
                return;
            case 7:
                ((k56) this.b).invoke();
                return;
            case 8:
                ((xu3) this.b).s();
                return;
            default:
                return;
        }
    }

    public void f(int i, int i2) {
        Object obj = this.b;
        switch (this.a) {
            case 0:
                ((EmptyRecyclerView) obj).F0();
                return;
            case 1:
                bc7[] bc7Arr = ChatsListSearchScreen.J0;
                ChatsListSearchScreen chatsListSearchScreen = (ChatsListSearchScreen) obj;
                if (((ov2) chatsListSearchScreen.n0().F0.a.getValue()).d.isEmpty()) {
                    ((EndlessRecyclerView2) chatsListSearchScreen.G0.T0(chatsListSearchScreen, ChatsListSearchScreen.J0[3])).setRefreshingNext(false);
                    return;
                }
                return;
            case 2:
                a();
                return;
            case 3:
                ((ng6) obj).a();
                return;
            case 4:
                cn9 cn9 = (cn9) obj;
                cn9.e -= i2;
                od3 od3 = cn9.d;
                ((nd3) od3.e).a.f(i + od3.d(cn9), i2);
                if (cn9.e < 1 && cn9.c.c == 2) {
                    od3.c();
                    return;
                }
                return;
            case 6:
                RecyclerView recyclerView = (RecyclerView) obj;
                recyclerView.n((String) null);
                x8 x8Var = recyclerView.s0;
                if (i2 < 1) {
                    x8Var.getClass();
                    return;
                }
                ArrayList arrayList = (ArrayList) x8Var.c;
                arrayList.add(x8Var.G((Object) null, 2, i, i2));
                x8Var.a |= 2;
                if (arrayList.size() == 1) {
                    h();
                    return;
                }
                return;
            case 7:
                ((k56) obj).invoke();
                return;
            case 8:
                ((xu3) obj).s();
                return;
            default:
                return;
        }
    }

    public void g() {
        hdc hdc;
        switch (this.a) {
            case 4:
                ((cn9) this.b).d.c();
                return;
            case 6:
                RecyclerView recyclerView = (RecyclerView) this.b;
                if (recyclerView.o != null && (hdc = recyclerView.A0) != null) {
                    int s = au1.s(hdc.c);
                    if (s != 1) {
                        if (s == 2) {
                            return;
                        }
                    } else if (hdc.j() <= 0) {
                        return;
                    }
                    recyclerView.requestLayout();
                    return;
                }
                return;
            default:
                return;
        }
    }

    public void h() {
        boolean z = RecyclerView.Q1;
        RecyclerView recyclerView = (RecyclerView) this.b;
        if (!z || !recyclerView.H0 || !recyclerView.G0) {
            recyclerView.O0 = true;
            recyclerView.requestLayout();
            return;
        }
        WeakHashMap weakHashMap = zmf.a;
        recyclerView.postOnAnimation(recyclerView.w0);
    }
}
