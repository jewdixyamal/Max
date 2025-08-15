package defpackage;

import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;

/* renamed from: xi1  reason: default package */
public final class xi1 extends ffe implements c66 {
    public final /* synthetic */ int X;
    public /* synthetic */ boolean Y;
    public /* synthetic */ Object Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xi1(int i, Continuation continuation, int i2) {
        super(i, continuation);
        this.X = i2;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.X) {
            case 0:
                boolean booleanValue = ((Boolean) obj2).booleanValue();
                xi1 xi1 = new xi1(3, (Continuation) obj3, 0);
                xi1.Z = (u9f) obj;
                xi1.Y = booleanValue;
                return xi1.o(e5f.a);
            case 1:
                boolean booleanValue2 = ((Boolean) obj).booleanValue();
                xi1 xi12 = new xi1(3, (Continuation) obj3, 1);
                xi12.Y = booleanValue2;
                xi12.Z = (aj6) obj2;
                return xi12.o(e5f.a);
            case 2:
                boolean booleanValue3 = ((Boolean) obj2).booleanValue();
                xi1 xi13 = new xi1(3, (Continuation) obj3, 2);
                xi13.Z = (ej7) obj;
                xi13.Y = booleanValue3;
                return xi13.o(e5f.a);
            case 3:
                boolean booleanValue4 = ((Boolean) obj).booleanValue();
                xi1 xi14 = new xi1(3, (Continuation) obj3, 3);
                xi14.Y = booleanValue4;
                xi14.Z = (b86) obj2;
                return xi14.o(e5f.a);
            case 4:
                boolean booleanValue5 = ((Boolean) obj2).booleanValue();
                xi1 xi15 = new xi1(3, (Continuation) obj3, 4);
                xi15.Z = (List) obj;
                xi15.Y = booleanValue5;
                return xi15.o(e5f.a);
            case 5:
                boolean booleanValue6 = ((Boolean) obj2).booleanValue();
                xi1 xi16 = new xi1(3, (Continuation) obj3, 5);
                xi16.Z = (Map) obj;
                xi16.Y = booleanValue6;
                return xi16.o(e5f.a);
            case 6:
                boolean booleanValue7 = ((Boolean) obj2).booleanValue();
                xi1 xi17 = new xi1(3, (Continuation) obj3, 6);
                xi17.Z = (Long) obj;
                xi17.Y = booleanValue7;
                return xi17.o(e5f.a);
            default:
                boolean booleanValue8 = ((Boolean) obj2).booleanValue();
                xi1 xi18 = new xi1(3, (Continuation) obj3, 7);
                xi18.Z = (cpa) obj;
                xi18.Y = booleanValue8;
                return xi18.o(e5f.a);
        }
    }

    public final Object o(Object obj) {
        switch (this.X) {
            case 0:
                od2.a0(obj);
                u9f u9f = (u9f) this.Z;
                if (!this.Y) {
                    return Boolean.FALSE;
                }
                int i = wi1.$EnumSwitchMapping$0[u9f.ordinal()];
                boolean z = true;
                if (i != 1) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 1:
                od2.a0(obj);
                return this.Y ? (aj6) this.Z : xi6.c;
            case 2:
                od2.a0(obj);
                ej7 ej7 = (ej7) this.Z;
                if (this.Y) {
                    return ej7;
                }
                return null;
            case 3:
                od2.a0(obj);
                return new kpa(Boolean.valueOf(this.Y), (b86) this.Z);
            case 4:
                od2.a0(obj);
                return this.Y ? (List) this.Z : nz4.a;
            case 5:
                od2.a0(obj);
                return this.Y ? ((Map) this.Z).values() : nz4.a;
            case 6:
                od2.a0(obj);
                Long l = (Long) this.Z;
                if (!this.Y || l == null) {
                    return null;
                }
                return l;
            default:
                od2.a0(obj);
                boolean z2 = this.Y;
                int ordinal = ((cpa) this.Z).ordinal();
                if (ordinal == 0) {
                    return c0g.a;
                }
                if (ordinal == 1 || ordinal == 2) {
                    return new d0g(z2);
                }
                if (ordinal == 3) {
                    return b0g.a;
                }
                throw new NoWhenBranchMatchedException();
        }
    }
}
