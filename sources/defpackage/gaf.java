package defpackage;

import java.util.Objects;

/* renamed from: gaf  reason: default package */
public final class gaf {
    public final Boolean a;
    public final Long b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final Boolean h;
    public final Integer i;
    public final Integer j;
    public final Integer k;
    public final Boolean l;
    public final Boolean m;
    public final Boolean n;
    public final int o;
    public final int p;
    public final faf q;
    public final int r;
    public final int s;
    public final Boolean t;
    public final Boolean u;
    public final int v;
    public final Boolean w;

    public gaf(eaf eaf) {
        this.a = eaf.a;
        this.b = eaf.b;
        this.c = eaf.c;
        this.d = eaf.d;
        this.e = eaf.e;
        this.f = eaf.f;
        this.g = eaf.g;
        this.h = eaf.h;
        this.i = eaf.i;
        this.j = eaf.j;
        this.k = eaf.k;
        this.l = eaf.l;
        this.m = eaf.m;
        this.n = eaf.n;
        this.o = eaf.o;
        this.p = eaf.p;
        this.q = eaf.q;
        this.r = eaf.r;
        this.s = eaf.s;
        this.t = eaf.t;
        this.u = eaf.u;
        this.v = eaf.v;
        this.w = eaf.w;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || gaf.class != obj.getClass()) {
            return false;
        }
        gaf gaf = (gaf) obj;
        return Objects.equals(this.a, gaf.a) && Objects.equals(this.b, gaf.b) && Objects.equals(this.c, gaf.c) && Objects.equals(this.d, gaf.d) && Objects.equals(this.e, gaf.e) && Objects.equals(this.f, gaf.f) && Objects.equals(this.g, gaf.g) && Objects.equals(this.h, gaf.h) && Objects.equals(this.i, gaf.i) && Objects.equals(this.j, gaf.j) && Objects.equals(this.k, gaf.k) && Objects.equals(this.l, gaf.l) && Objects.equals(this.m, gaf.m) && Objects.equals(this.n, gaf.n) && this.o == gaf.o && this.p == gaf.p && this.q == gaf.q && this.r == gaf.r && this.s == gaf.s && Objects.equals(this.t, gaf.t) && Objects.equals(this.u, gaf.u) && this.v == gaf.v && Objects.equals(this.w, gaf.w);
    }

    public final int hashCode() {
        return Objects.hash(new Object[]{this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, au1.a(this.o), au1.a(this.p), this.q, au1.a(this.r), au1.a(this.s), this.t, this.u, au1.a(this.v), this.w});
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("UserSettings{pushNewContacts=");
        sb.append(this.a);
        sb.append(", dontDustirbUntil=");
        sb.append(this.b);
        sb.append(", dialogsPushNotification='");
        sb.append(this.c);
        sb.append("', chatsPushNotification='");
        sb.append(this.d);
        sb.append("', pushSound='");
        sb.append(this.e);
        sb.append("', dialogsPushSound='");
        sb.append(this.f);
        sb.append("', chatsPushSound='");
        sb.append(this.g);
        sb.append("', hiddenOnline=");
        sb.append(this.h);
        sb.append(", led=");
        sb.append(this.i);
        sb.append(", dialogsLed=");
        sb.append(this.j);
        sb.append(", chatsLed=");
        sb.append(this.k);
        sb.append(", vibration=");
        sb.append(this.l);
        sb.append(", dialogsVibration=");
        sb.append(this.m);
        sb.append(", chatsVibration=");
        sb.append(this.n);
        sb.append(", chatsInvite=");
        sb.append(h4f.u(this.o));
        sb.append(", incomingCall=");
        sb.append(h4f.u(this.p));
        sb.append(", inactiveTtl=");
        sb.append(this.q);
        sb.append(", groupChatCallNotificationStatus=");
        int i2 = this.r;
        sb.append(i2 != 1 ? i2 != 2 ? "null" : "OFF" : "ON");
        sb.append(", suggestStickersStatus=");
        int i3 = this.s;
        sb.append(i3 != 1 ? i3 != 2 ? "null" : "OFF" : "ON");
        sb.append(", audioTranscriptionEnabled=");
        sb.append(this.t);
        sb.append(", safeMode=");
        sb.append(this.u);
        sb.append(", searchByPhone=");
        sb.append(h4f.u(this.v));
        sb.append(", unsafeFiles=");
        sb.append(this.w);
        sb.append("}");
        return sb.toString();
    }
}
