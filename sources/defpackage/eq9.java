package defpackage;

import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.TimeUnit;

/* renamed from: eq9  reason: default package */
public final class eq9 implements gq9 {
    public final long b;
    public final long c;

    public eq9(long j, long j2) {
        this.b = j;
        this.c = j2;
    }

    public final Date a(Date date) {
        int year = date.getYear();
        int month = date.getMonth();
        int date2 = date.getDate();
        int i = ft4.o;
        kt4 kt4 = kt4.HOURS;
        long j = this.c;
        return new Date(year, month, date2, (int) ft4.i(j, kt4), (int) (ft4.i(j, kt4.MINUTES) % ((long) 60)));
    }

    public final boolean b() {
        Date time = Calendar.getInstance().getTime();
        Date c2 = c(time);
        Date a = a(time);
        if ((time.compareTo(c2) < 0 || time.compareTo(a) > 0) && c2.compareTo(a) > 0) {
            c2.setTime(c2.getTime() - TimeUnit.DAYS.toMillis(1));
        } else if (a.compareTo(c2) < 0) {
            a.setTime(TimeUnit.DAYS.toMillis(1) + a.getTime());
        }
        return time.compareTo(c2) >= 0 && time.compareTo(a) < 0;
    }

    public final Date c(Date date) {
        int year = date.getYear();
        int month = date.getMonth();
        int date2 = date.getDate();
        int i = ft4.o;
        kt4 kt4 = kt4.HOURS;
        long j = this.b;
        return new Date(year, month, date2, (int) ft4.i(j, kt4), (int) (ft4.i(j, kt4.MINUTES) % ((long) 60)));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eq9)) {
            return false;
        }
        eq9 eq9 = (eq9) obj;
        return ft4.d(this.b, eq9.b) && ft4.d(this.c, eq9.c);
    }

    public final int hashCode() {
        int i = ft4.o;
        return Long.hashCode(this.c) + (Long.hashCode(this.b) * 31);
    }

    public final String toString() {
        return k7d.j("Schedule(startTime=", ft4.j(this.b), ", endTime=", ft4.j(this.c), ")");
    }
}
