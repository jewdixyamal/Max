package defpackage;

import java.util.Arrays;
import java.util.List;
import java.util.Set;

/* renamed from: j82  reason: default package */
public final /* synthetic */ class j82 implements qj3 {
    public final /* synthetic */ long X;
    public final /* synthetic */ int Y;
    public final /* synthetic */ long Z;
    public final /* synthetic */ p82 a;
    public final /* synthetic */ Set b;
    public final /* synthetic */ de2 c;
    public final /* synthetic */ int o;
    public final /* synthetic */ long s0;

    public /* synthetic */ j82(p82 p82, Set set, de2 de2, int i, long j, int i2, long j2, long j3) {
        this.a = p82;
        this.b = set;
        this.c = de2;
        this.o = i;
        this.X = j;
        this.Y = i2;
        this.Z = j2;
        this.s0 = j3;
    }

    public final void accept(Object obj) {
        u82 u82 = (u82) obj;
        p82 p82 = this.a;
        p82.getClass();
        Set set = this.b;
        w82 a2 = p82.H(u82, set).a();
        de2 de2 = this.c;
        a2.a = de2.X;
        boolean isEmpty = de2.c().isEmpty();
        int i = this.o;
        int i2 = this.Y;
        long j = this.s0;
        if (isEmpty) {
            long j2 = this.X;
            if (i > 0) {
                a2.b = j2;
            }
            if (i2 > 0) {
                a2.c = j2;
            }
        } else {
            a2.X = hm9.s((List) a2.X, de2.c(), this.Z, i, 0, i2, 0);
            rm4 rm4 = p82.s;
            if (i > 0 && de2.c().size() < i) {
                hm9.m("p82", "onChatMediaNew firstMessageUpdate", new Object[0]);
                cu8 j3 = ((au8) rm4.get()).j(j, ((fs8) de2.c().get(0)).a);
                if (j3 != null) {
                    a2.b = j3.b;
                } else {
                    hm9.k0("p82", (Exception) null, "onChatMediaNew can't find message to update firstMessage", Arrays.copyOf(new Object[0], 0));
                }
            }
            if (i2 > 0 && de2.c().size() < i2) {
                hm9.m("p82", "onChatMediaNew lastMessageUpdate", new Object[0]);
                cu8 j4 = ((au8) rm4.get()).j(j, ((fs8) de2.c().get(de2.c().size() - 1)).a);
                if (j4 != null) {
                    a2.c = j4.b;
                } else {
                    hm9.k0("p82", (Exception) null, "onChatMediaNew can't find message to update lastMessage", Arrays.copyOf(new Object[0], 0));
                }
            }
        }
        p82.J(j).setValue(new zc8(de2.Z, de2.Y, set, j));
        p82.a0(u82, set, a2.a());
    }
}
