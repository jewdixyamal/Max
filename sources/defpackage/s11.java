package defpackage;

import kotlin.coroutines.Continuation;
import ru.ok.android.externcalls.sdk.audio.CallsAudioDeviceInfo;
import ru.ok.tamtam.android.prefs.PmsKey;

/* renamed from: s11  reason: default package */
public final class s11 extends ffe implements e66 {
    public /* synthetic */ CallsAudioDeviceInfo X;
    public /* synthetic */ la1 Y;
    public /* synthetic */ boolean Z;
    public final /* synthetic */ h21 s0;
    public final /* synthetic */ je7 t0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public s11(h21 h21, je7 je7, Continuation continuation) {
        super(4, continuation);
        this.s0 = h21;
        this.t0 = je7;
    }

    public final Object h(Object obj, Object obj2, Object obj3, Object obj4) {
        boolean booleanValue = ((Boolean) obj3).booleanValue();
        s11 s11 = new s11(this.s0, this.t0, (Continuation) obj4);
        s11.X = (CallsAudioDeviceInfo) obj;
        s11.Y = (la1) obj2;
        s11.Z = booleanValue;
        e5f e5f = e5f.a;
        s11.o(e5f);
        return e5f;
    }

    public final Object o(Object obj) {
        Object value;
        m38 m38;
        m38 m382;
        m38 m383;
        a51 b;
        od2.a0(obj);
        CallsAudioDeviceInfo callsAudioDeviceInfo = this.X;
        la1 la1 = this.Y;
        boolean z = this.Z;
        h21 h21 = this.s0;
        q0e q0e = h21.t0;
        do {
            value = q0e.getValue();
            zq0 zq0 = (zq0) value;
            m38 = la1.r;
            m38 m384 = m38.b;
            m38 m385 = m38.o;
            boolean z2 = la1.g;
            je7 je7 = this.t0;
            m382 = (!z2 || (la1.e instanceof h95) || !((se5) ((qe5) je7.getValue())).q()) ? m385 : z ? m384 : m38.a;
            se5 se5 = (se5) ((qe5) je7.getValue());
            se5.getClass();
            if (se5.n(PmsKey.f45groupcallchatsupport, false)) {
                m31 m31 = la1.f;
                if ((m31 != null ? m31.a : null) != null) {
                    m383 = m384;
                    b = dz7.b(callsAudioDeviceInfo, h21.c.u());
                    zq0.getClass();
                }
            }
            m383 = m385;
            b = dz7.b(callsAudioDeviceInfo, h21.c.u());
            zq0.getClass();
        } while (!q0e.c(value, new zq0(m38, la1.q, m382, m383, b)));
        return e5f.a;
    }
}
