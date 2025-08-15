package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.coroutines.Continuation;

/* renamed from: wr  reason: default package */
public final class wr extends ffe implements a66 {
    public int X;
    public final /* synthetic */ zr Y;
    public final /* synthetic */ boolean Z;
    public final /* synthetic */ boolean s0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public wr(zr zrVar, boolean z, boolean z2, Continuation continuation) {
        super(2, continuation);
        this.Y = zrVar;
        this.Z = z;
        this.s0 = z2;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((wr) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new wr(this.Y, this.Z, this.s0, continuation);
    }

    public final Object o(Object obj) {
        tx3 tx3 = tx3.a;
        int i = this.X;
        ze0 ze0 = null;
        if (i == 0) {
            od2.a0(obj);
            nn7 nn7 = (nn7) this.Y.C0.getValue();
            Context t = this.Y.t();
            boolean z = this.Z;
            this.X = 1;
            obj = j47.t0(((w9a) ((kke) nn7.c.getValue())).b(), new ln7(z, nn7, t, (Continuation) null), this);
            if (obj == tx3) {
                return tx3;
            }
        } else if (i == 1) {
            od2.a0(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        Map map = (Map) obj;
        LinkedHashMap linkedHashMap = new LinkedHashMap(mz7.Z(map.size()));
        for (Map.Entry entry : map.entrySet()) {
            Object key = entry.getKey();
            ze0 ze02 = (ze0) entry.getKey();
            Drawable drawable = (Drawable) entry.getValue();
            Drawable drawable2 = (Drawable) entry.getValue();
            if (drawable2 instanceof rre) {
                drawable2 = ((rre) drawable2).a(0.45f);
            }
            linkedHashMap.put(key, new c62(Boolean.FALSE, ze02, drawable, drawable2));
        }
        zr zrVar = this.Y;
        bc7[] bc7Arr = zr.J0;
        String l = tfg.l(((p7b) zrVar.u()).a, this.Z);
        if (l != null) {
            ze0 = new ze0(l);
        }
        if (this.Z) {
            this.Y.w0 = linkedHashMap;
            this.Y.z0 = ze0;
        } else {
            this.Y.x0 = linkedHashMap;
            this.Y.y0 = ze0;
        }
        if (this.s0) {
            this.Y.x();
        }
        return e5f.a;
    }
}
