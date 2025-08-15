package defpackage;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.coroutines.Continuation;

/* renamed from: zkb  reason: default package */
public final class zkb extends ffe implements a66 {
    public int X;
    public final /* synthetic */ nab Y;
    public final /* synthetic */ blb Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zkb(nab nab, blb blb, Continuation continuation) {
        super(2, continuation);
        this.Y = nab;
        this.Z = blb;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((zkb) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new zkb(this.Y, this.Z, continuation);
    }

    public final Object o(Object obj) {
        wgb wgb;
        tx3 tx3 = tx3.a;
        int i = this.X;
        e5f e5f = e5f.a;
        nab nab = this.Y;
        blb blb = this.Z;
        if (i == 0) {
            od2.a0(obj);
            wm3 wm3 = nab.a;
            if (wm3 == null) {
                return e5f;
            }
            List singletonList = Collections.singletonList(wm3);
            ol3 ol3 = ol3.a;
            this.X = 1;
            if (((ds3) blb.b.getValue()).e(singletonList, ol3, this) == tx3) {
                return tx3;
            }
        } else if (i == 1) {
            od2.a0(obj);
        } else if (i == 2) {
            od2.a0(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        blb.getClass();
        wm3 wm32 = nab.a;
        if (wm32 != null) {
            Map map = nab.b;
            LinkedHashMap linkedHashMap = new LinkedHashMap(mz7.Z(map.size()));
            for (Map.Entry entry : map.entrySet()) {
                linkedHashMap.put(entry.getKey(), new jjc(((kjc) entry.getValue()).a));
            }
            wgb = new wgb(0, wm32.a, new bdb((Object) linkedHashMap, 0, (Object) nab.c));
        } else {
            wgb = null;
        }
        if (wgb == null) {
            return e5f;
        }
        this.X = 2;
        adb adb = blb.a;
        adb.getClass();
        return ote.j((ilc) adb.a, new uh(adb, 18, wgb), this) == tx3 ? tx3 : e5f;
    }
}
