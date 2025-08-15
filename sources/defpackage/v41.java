package defpackage;

import ru.ok.android.externcalls.sdk.audio.CallsAudioDeviceInfo;

/* renamed from: v41  reason: default package */
public final class v41 implements a51 {
    public final CallsAudioDeviceInfo a;
    public final boolean b;
    public final int c = y7a.H;
    public final int d;
    public final int e;
    public final gqe f;
    public final gqe g;

    public v41(CallsAudioDeviceInfo callsAudioDeviceInfo, boolean z) {
        this.a = callsAudioDeviceInfo;
        this.b = z;
        this.d = z ? x7a.w : x7a.v;
        this.e = x7a.F0;
        gqe gqe = new gqe(b8a.n2, ys.m0(new Object[]{callsAudioDeviceInfo.getName()}));
        this.f = gqe;
        this.g = gqe;
    }

    public final int a() {
        return this.d;
    }

    public final CallsAudioDeviceInfo b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v41)) {
            return false;
        }
        v41 v41 = (v41) obj;
        return tpa.f(this.a, v41.a) && this.b == v41.b;
    }

    public final jqe getContentDescription() {
        return this.g;
    }

    public final int getIcon() {
        return this.e;
    }

    public final int getId() {
        return this.c;
    }

    public final jqe getTitle() {
        return this.f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Bluetooth(device=" + this.a + ", isGroupCallEnabled=" + this.b + ")";
    }
}
