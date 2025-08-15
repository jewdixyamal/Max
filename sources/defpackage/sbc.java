package defpackage;

import android.animation.IntEvaluator;
import android.graphics.Path;
import java.util.NoSuchElementException;
import kotlin.coroutines.Continuation;
import one.me.sdk.messagewrite.recordcontrols.RecordControlsWidget;

/* renamed from: sbc  reason: default package */
public final class sbc extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ lsf Y;
    public final /* synthetic */ RecordControlsWidget Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public sbc(Continuation continuation, lsf lsf, RecordControlsWidget recordControlsWidget) {
        super(2, continuation);
        this.Y = lsf;
        this.Z = recordControlsWidget;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((sbc) n(obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        sbc sbc = new sbc(continuation, this.Y, this.Z);
        sbc.X = obj;
        return sbc;
    }

    /* JADX WARNING: type inference failed for: r5v17, types: [r2, hs] */
    public final Object o(Object obj) {
        byte[] bArr;
        hs hsVar;
        Object[] objArr;
        od2.a0(obj);
        byte[] bArr2 = (byte[]) this.X;
        r70 waveView = this.Y.getWaveView();
        bc7[] bc7Arr = RecordControlsWidget.b1;
        Long l = (Long) this.Z.I0().x0.a.getValue();
        long longValue = l != null ? l.longValue() : 0;
        waveView.s0 = bArr2;
        waveView.C0 = longValue;
        waveView.t0 = 0;
        int i = 0;
        waveView.u0 = false;
        waveView.w0.setColor(f8.G(qp4.u0.j(waveView).getIcon().k, 0.5f));
        Path path = waveView.z0;
        if (!path.isEmpty()) {
            path.reset();
        }
        if (waveView.getMeasuredWidth() != 0) {
            if (!(waveView.getMeasuredWidth() == 0 || (bArr = waveView.s0) == null)) {
                hs hsVar2 = waveView.A0;
                IntEvaluator intEvaluator = r70.F0;
                if (hsVar2 == null) {
                    int peaksCount = waveView.getPeaksCount();
                    ? r2Var = new r2();
                    if (peaksCount == 0) {
                        objArr = hs.o;
                    } else if (peaksCount > 0) {
                        objArr = new Object[peaksCount];
                    } else {
                        throw new IllegalArgumentException(zr6.h(peaksCount, "Illegal Capacity: "));
                    }
                    r2Var.b = objArr;
                    waveView.A0 = r2Var;
                    if (bArr.length > 1) {
                        byte[] bArr3 = waveView.s0;
                        if (bArr3 != null) {
                            for (byte b : ys.Z(bArr3.length - Math.min(bArr3.length, waveView.getPeaksCount()), bArr3, bArr3.length)) {
                                Byte b2 = waveView.B0;
                                byte intValue = (byte) r70.F0.evaluate(0.5f, Integer.valueOf(b2 != null ? b2.byteValue() : 0), Integer.valueOf(b)).intValue();
                                hs hsVar3 = waveView.A0;
                                if (hsVar3 != null) {
                                    hsVar3.b(Byte.valueOf(intValue));
                                }
                                waveView.B0 = Byte.valueOf(intValue);
                            }
                        }
                    }
                }
                byte[] bArr4 = waveView.s0;
                if (bArr4 != null) {
                    Byte b3 = waveView.B0;
                    if (b3 == null) {
                        waveView.B0 = (byte) 0;
                        hs hsVar4 = waveView.A0;
                        if (hsVar4 != null) {
                            hsVar4.b((byte) 0);
                        }
                    } else {
                        byte byteValue = b3.byteValue();
                        if (bArr4.length != 0) {
                            byte intValue2 = (byte) r70.F0.evaluate(0.5f, Integer.valueOf(byteValue), Integer.valueOf(bArr4[bArr4.length - 1])).intValue();
                            hs hsVar5 = waveView.A0;
                            if (hsVar5 != null) {
                                i = hsVar5.c;
                            }
                            if (i == waveView.getPeaksCount() && (hsVar = waveView.A0) != null) {
                                Byte b4 = (Byte) hsVar.j();
                            }
                            hs hsVar6 = waveView.A0;
                            if (hsVar6 != null) {
                                hsVar6.b(Byte.valueOf(intValue2));
                            }
                            waveView.B0 = Byte.valueOf(intValue2);
                        } else {
                            throw new NoSuchElementException("Array is empty.");
                        }
                    }
                }
            }
            hs hsVar7 = waveView.A0;
            float measuredHeight = ((float) waveView.getMeasuredHeight()) / 2.0f;
            path.reset();
            if (hsVar7 != null && !hsVar7.isEmpty()) {
                float f = waveView.o;
                float width = ((float) waveView.getWidth()) - (f / 2.0f);
                int size = hsVar7.getSize() - 1;
                if (size >= 0) {
                    while (true) {
                        int i2 = size - 1;
                        float measuredHeight2 = (((float) waveView.getMeasuredHeight()) / 127.0f) * ((float) ((Number) hsVar7.get(size)).byteValue());
                        float f2 = waveView.b;
                        if (measuredHeight2 < f2) {
                            measuredHeight2 = f2;
                        }
                        float f3 = measuredHeight2 / 2.0f;
                        path.moveTo(width, measuredHeight - f3);
                        path.lineTo(width, f3 + measuredHeight);
                        width = (width - f) - waveView.c;
                        if (i2 < 0) {
                            break;
                        }
                        size = i2;
                    }
                }
            }
        }
        waveView.postInvalidate();
        return e5f.a;
    }
}
