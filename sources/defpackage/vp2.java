package defpackage;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.coroutines.Continuation;

/* renamed from: vp2  reason: default package */
public final class vp2 extends ffe implements a66 {
    public int X;
    public final /* synthetic */ String Y;
    public final /* synthetic */ e52 Z;
    public final /* synthetic */ rq2 s0;
    public final /* synthetic */ Long t0;
    public final /* synthetic */ zy8 u0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public vp2(String str, e52 e52, rq2 rq2, Long l, zy8 zy8, Continuation continuation) {
        super(2, continuation);
        this.Y = str;
        this.Z = e52;
        this.s0 = rq2;
        this.t0 = l;
        this.u0 = zy8;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((vp2) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new vp2(this.Y, this.Z, this.s0, this.t0, this.u0, continuation);
    }

    public final Object o(Object obj) {
        String str;
        tx3 tx3 = tx3.a;
        int i = this.X;
        if (i == 0) {
            od2.a0(obj);
            e52 e52 = this.Z;
            Pattern pattern = e52.M() ? bre.c : bre.e;
            Pattern pattern2 = ura.a;
            String str2 = this.Y;
            Matcher matcher = pattern.matcher(str2);
            loop0:
            while (true) {
                str = str2;
                while (matcher.find()) {
                    Matcher matcher2 = pattern2.matcher(str);
                    boolean z = false;
                    while (matcher2.find() && matcher2.start() <= matcher.end()) {
                        if (matcher2.group().contains(matcher.group())) {
                            z = true;
                        }
                    }
                    if (!z && matcher.group().contains("/﻿")) {
                        str2 = str.replace(matcher.group(), matcher.group().replace("/﻿", String.valueOf('/')));
                    }
                }
                break loop0;
            }
            o89 o89 = this.s0.u0;
            zy8 zy8 = this.u0;
            cz5 a = zy8 != null ? zy8.a() : null;
            this.X = 1;
            if (o89.b(o89, e52.a, str, this.t0, a, this, 16) == tx3) {
                return tx3;
            }
        } else if (i == 1) {
            od2.a0(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return e5f.a;
    }
}
