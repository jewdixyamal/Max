package defpackage;

import java.util.Collections;

/* renamed from: dk9  reason: default package */
public final /* synthetic */ class dk9 implements f38 {
    public final /* synthetic */ fk9 a;

    public /* synthetic */ dk9(fk9 fk9) {
        this.a = fk9;
    }

    public final void a(b38 b38) {
        fk9 fk9 = this.a;
        e08 e08 = fk9.w0;
        if (e08 == null || !e08.h) {
            b38.a(Collections.emptyList());
            return;
        }
        fk9.s0.getClass();
        m28 m28 = m28.a;
        kw8 kw8 = kw8.a;
        kw8 kw82 = (kw8) m28.c(kw8);
        if (kw82 == kw8) {
            b38.a(Collections.emptyList());
        } else {
            b38.a(Collections.singletonList(kw82));
        }
    }
}
