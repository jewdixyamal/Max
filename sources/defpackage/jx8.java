package defpackage;

import android.content.Context;
import com.google.protobuf.nano.InvalidProtocolBufferNanoException;
import java.io.IOException;
import java.util.ArrayList;
import ru.ok.tamtam.nano.Protos;
import ru.ok.tamtam.nano.b;

/* renamed from: jx8  reason: default package */
public final class jx8 {
    public final int a;
    public final je7 b;
    public final je7 c;
    public final Context d;
    public final boolean e;

    public jx8(Context context, je7 je7, je7 je72, ri4 ri4, int i) {
        this.a = i;
        this.b = je7;
        this.c = je72;
        this.d = context.getApplicationContext();
        this.e = ri4.b().compareTo(vi4.o) >= 0;
    }

    public final ix8 a(byte[] bArr) {
        c6c c6c;
        byte[] bArr2 = b.a;
        try {
            Protos.MessageReactions parseFrom = Protos.MessageReactions.parseFrom(bArr);
            ArrayList arrayList = new ArrayList();
            int length = parseFrom.reactions.length;
            for (int i = 0; i < length; i++) {
                Protos.ReactionData reactionData = parseFrom.reactions[i].reaction;
                int i2 = reactionData.type;
                d6c.b.getClass();
                arrayList.add(new hx8(new c6c(hx9.q(i2), b(reactionData.reaction)), parseFrom.reactions[i].count));
            }
            int i3 = parseFrom.totalCount;
            Protos.ReactionData reactionData2 = parseFrom.yourReaction;
            if (reactionData2 == null) {
                c6c = null;
            } else {
                int i4 = reactionData2.type;
                d6c.b.getClass();
                c6c = new c6c(hx9.q(i4), b(parseFrom.yourReaction.reaction));
            }
            return new ix8(arrayList, i3, c6c);
        } catch (InvalidProtocolBufferNanoException e2) {
            throw new IOException(e2);
        }
    }

    public final v5c b(String str) {
        return new v5c(((tx4) this.b.getValue()).b(this.d.getResources().getDimensionPixelSize(this.a), str));
    }

    /* JADX WARNING: type inference failed for: r5v3, types: [ix8] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.LinkedHashMap c(java.util.Map r10) {
        /*
            r9 = this;
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            int r1 = r10.size()
            int r1 = defpackage.mz7.Z(r1)
            r0.<init>(r1)
            java.util.Set r10 = r10.entrySet()
            java.util.Iterator r10 = r10.iterator()
        L_0x0015:
            boolean r1 = r10.hasNext()
            if (r1 == 0) goto L_0x0070
            java.lang.Object r1 = r10.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r2 = r1.getKey()
            java.lang.Object r1 = r1.getValue()
            fx8 r1 = (defpackage.fx8) r1
            r3 = 0
            if (r1 == 0) goto L_0x006c
            java.util.ArrayList r4 = new java.util.ArrayList
            java.util.List r5 = r1.a
            r6 = 10
            int r6 = defpackage.z53.S(r5, r6)
            r4.<init>(r6)
            java.util.Iterator r5 = r5.iterator()
        L_0x003f:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L_0x005c
            java.lang.Object r6 = r5.next()
            cx8 r6 = (defpackage.cx8) r6
            hx8 r7 = new hx8
            bx8 r8 = r6.a
            c6c r8 = r9.d(r8)
            int r6 = r6.b
            r7.<init>(r8, r6)
            r4.add(r7)
            goto L_0x003f
        L_0x005c:
            bx8 r5 = r1.c
            if (r5 == 0) goto L_0x0064
            c6c r3 = r9.d(r5)
        L_0x0064:
            ix8 r5 = new ix8
            int r1 = r1.b
            r5.<init>(r4, r1, r3)
            r3 = r5
        L_0x006c:
            r0.put(r2, r3)
            goto L_0x0015
        L_0x0070:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jx8.c(java.util.Map):java.util.LinkedHashMap");
    }

    public final c6c d(bx8 bx8) {
        hx9 hx9 = d6c.b;
        int i = bx8.a.a;
        hx9.getClass();
        return new c6c(hx9.q(i), b(bx8.b));
    }
}
