package defpackage;

import ru.ok.android.externcalls.sdk.audio.internal.impl3.CallsAudioManagerV3Impl;
import ru.ok.tamtam.android.prefs.PmsKey;

/* renamed from: v72  reason: default package */
public final /* synthetic */ class v72 implements qj3 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ long o;

    public /* synthetic */ v72(long j, long j2) {
        this.b = j;
        this.o = j2;
        this.c = null;
    }

    public final void accept(Object obj) {
        long j = this.b;
        long j2 = this.o;
        Object obj2 = this.c;
        switch (this.a) {
            case 0:
                u82 u82 = (u82) obj;
                String str = (String) obj2;
                hm9.m("p82", "reactions, updateLastReaction chatId = %d, lastReactedMessageId = %d, lastREaction = %s", Long.valueOf(j), Long.valueOf(j2), str);
                if (j2 == 0) {
                    u82.n0 = 0;
                    u82.o0 = null;
                    return;
                }
                if (u82.n0 != j2) {
                    u82.n0 = j2;
                }
                String str2 = u82.o0;
                if (str2 == null || !str2.equals(str)) {
                    u82.o0 = str;
                    return;
                }
                return;
            case 1:
                u82 u822 = (u82) obj;
                u822.getClass();
                u822.m0 = new g92(this.o, (String) obj2, this.b);
                return;
            default:
                j10 j10 = (j10) obj;
                au8 au8 = (au8) obj2;
                au8.getClass();
                if (j10.e != null && j2 != 0) {
                    z7d z7d = ((p7b) au8.c).b;
                    z7d.getClass();
                    if (j2 >= ((long) ((int) z7d.q(PmsKey.f83mindurationsaveaudiostarttime, (long) 20)))) {
                        if (j2 - j <= CallsAudioManagerV3Impl.USED_DEVICE_RECOVER_TIMEOUT_MS) {
                            j = 0;
                        }
                        i10 i10 = j10.e;
                        if (i10 == null) {
                            i10 = i10.j;
                        }
                        h10 a2 = i10.a();
                        a2.g = j;
                        a2.c = j2;
                        a2.h = System.currentTimeMillis();
                        j10.e = new i10(a2);
                        return;
                    }
                    return;
                }
                return;
        }
    }

    public /* synthetic */ v72(long j, String str, long j2) {
        this.b = j;
        this.c = str;
        this.o = j2;
    }

    public /* synthetic */ v72(au8 au8, long j, long j2) {
        this.c = au8;
        this.b = j;
        this.o = j2;
    }
}
