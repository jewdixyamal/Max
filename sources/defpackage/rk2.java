package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import ru.ok.tamtam.nano.Tasks;

/* renamed from: rk2  reason: default package */
public final class rk2 extends ol implements lme, hua {
    public long X;
    public final int Y;
    public final List Z;
    public final long o;
    public final ek2 s0;
    public final boolean t0;
    public final int u0;
    public final int v0;
    public final String w0 = rk2.class.getName();

    public rk2(long j, long j2, long j3, int i, List list, ek2 ek2, boolean z, int i2, int i3) {
        super(j);
        this.o = j2;
        this.X = j3;
        this.Y = i;
        this.Z = list;
        this.s0 = ek2;
        this.t0 = z;
        this.u0 = i2;
        this.v0 = i3;
    }

    public final int c() {
        k92 k92;
        i92 i92;
        e52 C = m().C(this.o);
        if (C == null || (i92 = k92.c) == i92.Y || i92 == i92.X || i92 == i92.o) {
            return 3;
        }
        if (this.X == 0) {
            long j = (k92 = C.b).a;
            if (j != 0) {
                this.X = j;
            }
        }
        return this.X != 0 ? 1 : 2;
    }

    public final void d() {
        hm9.m(this.w0, "onMaxFailCount", new Object[0]);
        int ordinal = this.s0.ordinal();
        int i = this.Y;
        List list = this.Z;
        long j = this.o;
        if (ordinal == 0) {
            int s = au1.s(i);
            if (s == 0) {
                p82 m = m();
                e52 C = m.C(j);
                if (C != null) {
                    m.h(j, false, new z72(1, list));
                    m.m.c(new vz2(Collections.singletonList(Long.valueOf(C.a)), false));
                }
            } else if (s == 1) {
                m().d(j, list);
            } else {
                throw new NoWhenBranchMatchedException();
            }
        } else if (ordinal == 1) {
            int s2 = au1.s(i);
            if (s2 == 0) {
                p82 m2 = m();
                e52 C2 = m2.C(j);
                if (C2 != null) {
                    m2.h(j, false, new z72(2, list));
                    m2.m.c(new vz2(Collections.singletonList(Long.valueOf(C2.a)), false));
                }
            } else if (s2 == 1) {
                p82 m3 = m();
                e52 C3 = m3.C(j);
                if (C3 != null) {
                    m3.h(j, false, new ui0((Object) m3, (Object) list, this.v0, 2));
                    m3.m.c(new vz2(Collections.singletonList(Long.valueOf(C3.a)), false));
                }
            } else {
                throw new NoWhenBranchMatchedException();
            }
        } else if (ordinal != 2) {
            throw new NoWhenBranchMatchedException();
        }
        ((k4a) j()).j(this.X);
        t().d(this.a);
    }

    public final void e(gle gle) {
        e52 C;
        sk2 sk2 = (sk2) gle;
        boolean z = !sk2.X.isEmpty();
        long j = this.o;
        if (z) {
            ArrayList k = p().k(j, sk2.X);
            if (!k.isEmpty()) {
                ArrayList arrayList = new ArrayList(z53.S(k, 10));
                Iterator it = k.iterator();
                while (it.hasNext()) {
                    arrayList.add(Long.valueOf(((cu8) it.next()).b));
                }
                p().c(j, arrayList);
                l().c(new re9(j, arrayList, (mg4) null));
            }
        }
        if (sk2.c != null) {
            m().c0(Collections.singletonList(sk2.c));
        }
        if (this.s0 == ek2.ADMIN && this.Y == 1 && (C = m().C(j)) != null) {
            Iterator it2 = this.Z.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                if (!C.b.R.containsKey(Long.valueOf(((Number) it2.next()).longValue()))) {
                    l().c(new oi0(this.a, new pke("friend.blocks.me", "friend.blocks.me", (String) null)));
                    break;
                }
            }
        }
        l().c(new tk2(this.a, this.Z, this.s0, this.o, this.Y));
    }

    public final byte[] f() {
        Tasks.ChatMembersUpdate chatMembersUpdate = new Tasks.ChatMembersUpdate();
        chatMembersUpdate.requestId = this.a;
        chatMembersUpdate.chatId = this.o;
        chatMembersUpdate.chatServerId = this.X;
        chatMembersUpdate.operation = wg0.c(this.Y);
        chatMembersUpdate.userIds = nd7.j(this.Z);
        chatMembersUpdate.chatMemberType = this.s0.a;
        chatMembersUpdate.showHistory = this.t0;
        return qw8.toByteArray(chatMembersUpdate);
    }

    public final void g(pke pke) {
        if (!f46.U(pke.b)) {
            d();
        }
        l().c(new oi0(this.a, pke));
        if (this.s0 == ek2.MEMBER) {
            l().c(new ku3(pke, this.o, this.Z));
        }
    }

    public final long getId() {
        return this.a;
    }

    public final iua getType() {
        return iua.TYPE_CHAT_MEMBERS_UPDATE;
    }

    public final int h() {
        return 1000000;
    }

    public final dle i() {
        return new au(this.X, this.Y, this.Z, this.s0, this.t0, this.u0, this.v0);
    }
}
