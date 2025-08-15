package defpackage;

import java.util.LinkedHashSet;
import java.util.List;
import kotlin.coroutines.Continuation;

/* renamed from: v23  reason: default package */
public final class v23 extends ffe implements a66 {
    public final /* synthetic */ w23 X;
    public final /* synthetic */ long Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public v23(w23 w23, long j, Continuation continuation) {
        super(2, continuation);
        this.X = w23;
        this.Y = j;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((v23) n((sx3) obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new v23(this.X, this.Y, continuation);
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        w23 w23 = this.X;
        String str = w23.a;
        je7 je7 = w23.c;
        String str2 = w23.a;
        StringBuilder sb = new StringBuilder("cancelAllRunningDraftTasks for chat ");
        long j = this.Y;
        sb.append(j);
        hm9.m(str, sb.toString(), new Object[0]);
        try {
            List<une> i = ((eoe) je7.getValue()).i(w23.d);
            int size = i.size();
            hm9.m(str2, "cancelAllRunningDraftTasks: all tasks count = " + size, new Object[0]);
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            for (une une : i) {
                hua hua = une.f;
                if (hua instanceof dp4) {
                    if (((dp4) hua).o == j) {
                    }
                } else if (hua instanceof hp4) {
                    if (((hp4) hua).o != j) {
                    }
                }
                linkedHashSet.add(new Long(une.a));
            }
            ((eoe) je7.getValue()).e(linkedHashSet);
            int size2 = linkedHashSet.size();
            hm9.m(str2, "cancelAllRunningDraftTasks: removed tasks count = " + size2, new Object[0]);
        } catch (Throwable th) {
            hm9.p(str2, "cancelAllRunningDraftTasks: error!", th);
        }
        return e5f.a;
    }
}
