package defpackage;

import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import one.me.settings.privacy.ui.SettingsPrivacyScreen;
import one.me.settings.privacy.ui.pincode.EnterPinCodeScreen;

/* renamed from: k25  reason: default package */
public final class k25 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ EnterPinCodeScreen Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public k25(Continuation continuation, EnterPinCodeScreen enterPinCodeScreen) {
        super(2, continuation);
        this.Y = enterPinCodeScreen;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((k25) n(obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        k25 k25 = new k25(continuation, this.Y);
        k25.X = obj;
        return k25;
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        p25 p25 = (p25) this.X;
        EnterPinCodeScreen enterPinCodeScreen = this.Y;
        uu3 targetController = enterPinCodeScreen.getTargetController();
        j25 j25 = targetController instanceof j25 ? (j25) targetController : null;
        int ordinal = p25.ordinal();
        q7c q7c = enterPinCodeScreen.o;
        if (ordinal == 0) {
            ((m0b) q7c.T0(enterPinCodeScreen, EnterPinCodeScreen.X[0])).setState(gg3.SUCCESS);
        } else if (ordinal == 1) {
            ((m0b) q7c.T0(enterPinCodeScreen, EnterPinCodeScreen.X[0])).setState(gg3.ERROR);
        } else {
            throw new NoWhenBranchMatchedException();
        }
        if (j25 != null) {
            cid m0 = ((SettingsPrivacyScreen) j25).m0();
            m0.getClass();
            int ordinal2 = p25.ordinal();
            if (ordinal2 == 0) {
                long j = m0.K0;
                if (j == jha.h) {
                    pnf.n(m0, ((w9a) m0.o).a(), (vx3) null, new uhd(m0, (Continuation) null), 2);
                } else if (j == jha.i) {
                    m0.w(aed.i);
                } else if (j == jha.e) {
                    m0.w(aed.h);
                } else if (j == jha.c) {
                    m0.w(aed.j);
                } else if (j == jha.b) {
                    m0.w(aed.l);
                }
                m0.K0 = 0;
            } else if (ordinal2 != 1) {
                throw new NoWhenBranchMatchedException();
            }
        }
        return e5f.a;
    }
}
