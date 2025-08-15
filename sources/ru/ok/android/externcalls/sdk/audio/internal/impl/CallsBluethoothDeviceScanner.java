package ru.ok.android.externcalls.sdk.audio.internal.impl;

import android.annotation.TargetApi;
import android.media.AudioDeviceCallback;
import android.media.AudioManager;
import android.os.Handler;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0000\u0018\u0000 \u001c2\u00020\u0001:\u0003\u001d\u001c\u001eB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0011\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u000fH\u0003¢\u0006\u0004\b\u0012\u0010\u0011J\u0019\u0010\u0013\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0007¢\u0006\u0004\b\u0013\u0010\fJ\r\u0010\u0014\u001a\u00020\n¢\u0006\u0004\b\u0014\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0015R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0016R\u0018\u0010\t\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\t\u0010\u0017R\u001d\u0010\u001b\u001a\u0004\u0018\u00010\u000f8BX\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u0011¨\u0006\u001f"}, d2 = {"Lru/ok/android/externcalls/sdk/audio/internal/impl/CallsBluethoothDeviceScanner;", "", "Landroid/os/Handler;", "audioManagerHandler", "Lru/ok/android/externcalls/sdk/audio/internal/impl/CallsBluethoothDeviceScanner$Listener;", "listener", "<init>", "(Landroid/os/Handler;Lru/ok/android/externcalls/sdk/audio/internal/impl/CallsBluethoothDeviceScanner$Listener;)V", "Landroid/media/AudioManager;", "audioManager", "Le5f;", "startApiM", "(Landroid/media/AudioManager;)V", "stopApiM", "()V", "Landroid/media/AudioDeviceCallback;", "createCallback", "()Landroid/media/AudioDeviceCallback;", "createCallbackM", "start", "stop", "Landroid/os/Handler;", "Lru/ok/android/externcalls/sdk/audio/internal/impl/CallsBluethoothDeviceScanner$Listener;", "Landroid/media/AudioManager;", "callback$delegate", "Lje7;", "getCallback", "callback", "Companion", "BluetoothDeviceIntent", "Listener", "calls-audiomanager_release"}, k = 1, mv = {1, 9, 0})
public final class CallsBluethoothDeviceScanner {
    public static final Companion Companion = new Companion((z84) null);
    private AudioManager audioManager;
    private final Handler audioManagerHandler;
    private final je7 callback$delegate = new khe(new CallsBluethoothDeviceScanner$callback$2(this));
    /* access modifiers changed from: private */
    public final Listener listener;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u000b\u001a\u00020\u0005H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"Lru/ok/android/externcalls/sdk/audio/internal/impl/CallsBluethoothDeviceScanner$BluetoothDeviceIntent;", "", "id", "", "name", "", "(ILjava/lang/String;)V", "getId", "()I", "getName", "()Ljava/lang/String;", "toString", "calls-audiomanager_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class BluetoothDeviceIntent {
        private final int id;
        private final String name;

        public BluetoothDeviceIntent(int i, String str) {
            this.id = i;
            this.name = str;
        }

        public final int getId() {
            return this.id;
        }

        public final String getName() {
            return this.name;
        }

        public String toString() {
            int i = this.id;
            String str = this.name;
            return i + ":" + str;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0007¨\u0006\u0005"}, d2 = {"Lru/ok/android/externcalls/sdk/audio/internal/impl/CallsBluethoothDeviceScanner$Companion;", "", "()V", "isSupported", "", "calls-audiomanager_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final boolean isSupported() {
            return true;
        }

        public /* synthetic */ Companion(z84 z84) {
            this();
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&ø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0007À\u0006\u0001"}, d2 = {"Lru/ok/android/externcalls/sdk/audio/internal/impl/CallsBluethoothDeviceScanner$Listener;", "", "onDeviceAvailable", "", "device", "Lru/ok/android/externcalls/sdk/audio/internal/impl/CallsBluethoothDeviceScanner$BluetoothDeviceIntent;", "onDeviceUnavailable", "calls-audiomanager_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface Listener {
        boolean onDeviceAvailable(BluetoothDeviceIntent bluetoothDeviceIntent);

        boolean onDeviceUnavailable(BluetoothDeviceIntent bluetoothDeviceIntent);
    }

    public CallsBluethoothDeviceScanner(Handler handler, Listener listener2) {
        this.audioManagerHandler = handler;
        this.listener = listener2;
    }

    /* access modifiers changed from: private */
    public final AudioDeviceCallback createCallback() {
        if (Companion.isSupported()) {
            return createCallbackM();
        }
        return null;
    }

    @TargetApi(23)
    private final AudioDeviceCallback createCallbackM() {
        return new CallsBluethoothDeviceScanner$createCallbackM$1(this);
    }

    private final AudioDeviceCallback getCallback() {
        return (AudioDeviceCallback) this.callback$delegate.getValue();
    }

    public static final boolean isSupported() {
        return Companion.isSupported();
    }

    @TargetApi(23)
    private final void startApiM(AudioManager audioManager2) {
        AudioDeviceCallback callback = getCallback();
        if (callback != null) {
            audioManager2.registerAudioDeviceCallback(callback, this.audioManagerHandler);
        }
        this.audioManager = audioManager2;
    }

    @TargetApi(23)
    private final void stopApiM() {
        AudioManager audioManager2;
        AudioDeviceCallback callback = getCallback();
        if (!(callback == null || (audioManager2 = this.audioManager) == null)) {
            audioManager2.unregisterAudioDeviceCallback(callback);
        }
        this.audioManager = null;
    }

    public final void start(AudioManager audioManager2) {
        if (Companion.isSupported() && audioManager2 != null) {
            startApiM(audioManager2);
        }
    }

    public final void stop() {
        if (Companion.isSupported()) {
            stopApiM();
        }
    }
}
