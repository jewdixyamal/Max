package defpackage;

import android.location.Location;

/* renamed from: dr7  reason: default package */
public abstract class dr7 {
    public static float a(Location location) {
        return location.getBearingAccuracyDegrees();
    }

    public static float b(Location location) {
        return location.getSpeedAccuracyMetersPerSecond();
    }

    public static float c(Location location) {
        return location.getVerticalAccuracyMeters();
    }

    public static boolean d(Location location) {
        return location.hasBearingAccuracy();
    }

    public static boolean e(Location location) {
        return location.hasSpeedAccuracy();
    }

    public static boolean f(Location location) {
        return location.hasVerticalAccuracy();
    }

    public static void g(Location location) {
        try {
            np8.s().setByte(location, (byte) (np8.s().getByte(location) & (~np8.t())));
        } catch (NoSuchFieldException e) {
            NoSuchFieldError noSuchFieldError = new NoSuchFieldError();
            noSuchFieldError.initCause(e);
            throw noSuchFieldError;
        } catch (IllegalAccessException e2) {
            IllegalAccessError illegalAccessError = new IllegalAccessError();
            illegalAccessError.initCause(e2);
            throw illegalAccessError;
        }
    }

    public static void h(Location location) {
        try {
            np8.s().setByte(location, (byte) (np8.s().getByte(location) & (~np8.u())));
        } catch (NoSuchFieldException e) {
            NoSuchFieldError noSuchFieldError = new NoSuchFieldError();
            noSuchFieldError.initCause(e);
            throw noSuchFieldError;
        } catch (IllegalAccessException e2) {
            IllegalAccessError illegalAccessError = new IllegalAccessError();
            illegalAccessError.initCause(e2);
            throw illegalAccessError;
        }
    }

    public static void i(Location location) {
        try {
            np8.s().setByte(location, (byte) (np8.s().getByte(location) & (~np8.v())));
        } catch (IllegalAccessException | NoSuchFieldException e) {
            IllegalAccessError illegalAccessError = new IllegalAccessError();
            illegalAccessError.initCause(e);
            throw illegalAccessError;
        }
    }

    public static void j(Location location, float f) {
        location.setBearingAccuracyDegrees(f);
    }

    public static void k(Location location, float f) {
        location.setSpeedAccuracyMetersPerSecond(f);
    }

    public static void l(Location location, float f) {
        location.setVerticalAccuracyMeters(f);
    }
}
