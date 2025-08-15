package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: xwf  reason: default package */
public final class xwf extends ffe implements a66 {
    public int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ gxf Z;
    public final /* synthetic */ dxf s0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public xwf(dxf dxf, gxf gxf, Continuation continuation) {
        super(2, continuation);
        this.Z = gxf;
        this.s0 = dxf;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((xwf) n((mwf) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        xwf xwf = new xwf(this.s0, this.Z, continuation);
        xwf.Y = obj;
        return xwf;
    }

    public final Object o(Object obj) {
        String str;
        tx3 tx3 = tx3.a;
        int i = this.X;
        dxf dxf = this.s0;
        if (i == 0) {
            od2.a0(obj);
            mwf mwf = (mwf) this.Y;
            if (wwf.$EnumSwitchMapping$0[mwf.ordinal()] == 1) {
                xxc xxc = twf.a;
                hm9.m("DownloadFromWebApp", "processDownloadFile complete", new Object[0]);
                jxf jxf = new jxf(this.Z.a, mwf.a);
                zt0 zt0 = dxf.f;
                ja7 ja7 = dxf.a;
                ja7.getClass();
                x97 x97 = new x97("WebAppDownloadFile", ja7.b(jxf.Companion.serializer(), jxf));
                this.Y = "WebAppDownloadFile";
                this.X = 1;
                if (zt0.o(x97, this) == tx3) {
                    return tx3;
                }
                str = "WebAppDownloadFile";
            }
            return e5f.a;
        } else if (i == 1) {
            od2.a0(obj);
            str = (String) this.Y;
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        wsf wsf = dxf.g;
        if (wsf != null) {
            iwf.a((iwf) dxf.b.getValue(), str, wsf.a, wsf.b, true, 0, (Integer) null, (Integer) null, 240);
        }
        return e5f.a;
    }
}
