package defpackage;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;

/* renamed from: ua2  reason: default package */
public final /* synthetic */ class ua2 implements k56 {
    public final /* synthetic */ int a;
    public final /* synthetic */ zb2 b;

    public /* synthetic */ ua2(zb2 zb2, int i) {
        this.a = i;
        this.b = zb2;
    }

    public final Object invoke() {
        switch (this.a) {
            case 0:
                return new nkc("all.chat.folder", ((rba) this.b.c.getValue()).a.getString(jpc.f0), (String) null, 0, (Set) wz4.a, false, false, (List) null, (Long) null, (Map) null, (List) null, (Set) null, 8064);
            default:
                String uuid = UUID.randomUUID().toString();
                zb2 zb2 = this.b;
                return y53.N(new nkc(uuid, ((rba) zb2.c.getValue()).a.getString(jpc.i0), "👤", 0, Collections.singleton(pa2.y0), false, false, (List) null, (Long) null, (Map) null, (List) null, (Set) null, 8064), new nkc(UUID.randomUUID().toString(), ((rba) zb2.c.getValue()).a.getString(jpc.j0), "✉️", 1, bcd.a0(pa2.Z, pa2.s0), false, false, (List) null, (Long) null, (Map) null, (List) null, (Set) null, 8064));
        }
    }
}
