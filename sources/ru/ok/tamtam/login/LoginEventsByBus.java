package ru.ok.tamtam.login;

import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.internal.ContextScope;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lru/ok/tamtam/login/LoginEventsByBus;", "Lvt7;", "Lut7;", "event", "Le5f;", "onEvent", "(Lut7;)V", "tamtam-android-sdk_release"}, k = 1, mv = {2, 0, 0})
final class LoginEventsByBus implements vt7 {
    public final kld a = lld.b(0, 0, 0, 7);
    public final ContextScope b;

    public LoginEventsByBus(av0 av0, kke kke) {
        this.b = j1e.a(((w9a) kke).c().getImmediate());
        av0.d(this);
    }

    @uae
    @Keep
    public final void onEvent(ut7 ut7) {
        j47.T(this.b, (lx3) null, (vx3) null, new a(this, ut7, (Continuation) null), 3);
    }

    public final v7c stream() {
        return new v7c(this.a);
    }
}
