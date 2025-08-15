package defpackage;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.coroutines.Continuation;

/* renamed from: ji4  reason: default package */
public final class ji4 extends ffe implements c66 {
    public final /* synthetic */ int X;
    public int Y;
    public /* synthetic */ on5 Z;
    public /* synthetic */ Object[] s0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ji4(int i, Continuation continuation, int i2) {
        super(i, continuation);
        this.X = i2;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        on5 on5 = (on5) obj;
        Object[] objArr = (Object[]) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.X) {
            case 0:
                ji4 ji4 = new ji4(3, continuation, 0);
                ji4.Z = on5;
                ji4.s0 = objArr;
                return ji4.o(e5f.a);
            case 1:
                ji4 ji42 = new ji4(3, continuation, 1);
                ji42.Z = on5;
                ji42.s0 = objArr;
                return ji42.o(e5f.a);
            case 2:
                ji4 ji43 = new ji4(3, continuation, 2);
                ji43.Z = on5;
                ji43.s0 = objArr;
                return ji43.o(e5f.a);
            default:
                ji4 ji44 = new ji4(3, continuation, 3);
                ji44.Z = on5;
                ji44.s0 = objArr;
                return ji44.o(e5f.a);
        }
    }

    public final Object o(Object obj) {
        switch (this.X) {
            case 0:
                tx3 tx3 = tx3.a;
                int i = this.Y;
                if (i == 0) {
                    od2.a0(obj);
                    on5 on5 = this.Z;
                    List[] listArr = (List[]) this.s0;
                    ArrayList arrayList = new ArrayList();
                    for (List V : listArr) {
                        d63.V(V, arrayList);
                    }
                    this.Y = 1;
                    if (on5.a(arrayList, this) == tx3) {
                        return tx3;
                    }
                } else if (i == 1) {
                    od2.a0(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                return e5f.a;
            case 1:
                tx3 tx32 = tx3.a;
                int i2 = this.Y;
                e5f e5f = e5f.a;
                if (i2 == 0) {
                    od2.a0(obj);
                    on5 on52 = this.Z;
                    this.Y = 1;
                    if (on52.a(e5f, this) == tx32) {
                        return tx32;
                    }
                } else if (i2 == 1) {
                    od2.a0(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                return e5f;
            case 2:
                tx3 tx33 = tx3.a;
                int i3 = this.Y;
                if (i3 == 0) {
                    od2.a0(obj);
                    on5 on53 = this.Z;
                    kba[] kbaArr = (kba[]) this.s0;
                    int Z2 = mz7.Z(kbaArr.length);
                    if (Z2 < 16) {
                        Z2 = 16;
                    }
                    LinkedHashMap linkedHashMap = new LinkedHashMap(Z2);
                    for (kba kba : kbaArr) {
                        linkedHashMap.put(kba.a, kba);
                    }
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap(mz7.Z(linkedHashMap.size()));
                    for (Map.Entry entry : linkedHashMap.entrySet()) {
                        linkedHashMap2.put(entry.getKey(), ((kba) entry.getValue()).b);
                    }
                    yv5 yv5 = new yv5(linkedHashMap2);
                    this.Y = 1;
                    if (on53.a(yv5, this) == tx33) {
                        return tx33;
                    }
                } else if (i3 == 1) {
                    od2.a0(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                return e5f.a;
            default:
                tx3 tx34 = tx3.a;
                int i4 = this.Y;
                if (i4 == 0) {
                    od2.a0(obj);
                    on5 on54 = this.Z;
                    rya[] ryaArr = (rya[]) this.s0;
                    int Z3 = mz7.Z(ryaArr.length);
                    if (Z3 < 16) {
                        Z3 = 16;
                    }
                    LinkedHashMap linkedHashMap3 = new LinkedHashMap(Z3);
                    for (rya rya : ryaArr) {
                        linkedHashMap3.put(new Long(rya.a), rya);
                    }
                    this.Y = 1;
                    if (on54.a(linkedHashMap3, this) == tx34) {
                        return tx34;
                    }
                } else if (i4 == 1) {
                    od2.a0(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                return e5f.a;
        }
    }
}
