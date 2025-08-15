package defpackage;

import java.util.concurrent.TimeUnit;

/* renamed from: ioc  reason: default package */
public final class ioc {
    public final /* synthetic */ int a;
    public final hoc b;
    public moc c;
    public tj4 d;
    public final long e;
    public final long f;
    public final float g;
    public final float h;

    public ioc(hoc hoc) {
        this.a = 0;
        this.c = null;
        this.d = null;
        this.e = TimeUnit.MILLISECONDS.toMillis(200);
        this.f = TimeUnit.SECONDS.toMillis(4);
        this.g = 2.0f;
        this.h = 0.1f;
        this.b = hoc;
    }

    public String toString() {
        switch (this.a) {
            case 1:
                return "RtcCommandConfig{command=" + this.b + ", sentListener=null, successListener=" + this.c + ", errorListener=" + this.d + ", maxRetryCount=0, minRetryTimeoutMs=" + this.e + ", maxRetryTimeoutMs=" + this.f + ", retryBackoffFactor=" + this.g + ", retryBackoffJitter=" + this.h + '}';
            default:
                return super.toString();
        }
    }

    public ioc(ioc ioc) {
        this.a = 1;
        hoc hoc = ioc.b;
        if (hoc != null) {
            long j = ioc.e;
            if (j >= 0) {
                long j2 = ioc.f;
                if (j2 >= 0) {
                    float f2 = ioc.g;
                    if (f2 >= 0.0f) {
                        float f3 = ioc.h;
                        if (f3 >= 0.0f) {
                            this.b = hoc;
                            this.c = ioc.c;
                            this.d = ioc.d;
                            this.e = j;
                            this.f = j2;
                            this.g = f2;
                            this.h = f3;
                            return;
                        }
                        throw new IllegalArgumentException("Illegal 'retryBackoffJitter' value: " + f3);
                    }
                    throw new IllegalArgumentException("Illegal 'retryBackoffFactor' value: " + f2);
                }
                throw new IllegalArgumentException(ey8.h(j2, "Illegal 'maxRetryTimeoutMs' value: "));
            }
            throw new IllegalArgumentException(ey8.h(j, "Illegal 'minRetryTimeoutMs' value: "));
        }
        throw new IllegalArgumentException("Illegal 'command' value: null");
    }
}
