package uploadfile.conghuy.com.jwplayer;

import android.widget.TextView;

import com.longtailvideo.jwplayer.JWPlayerView;
import com.longtailvideo.jwplayer.core.PlayerState;
import com.longtailvideo.jwplayer.events.AdClickEvent;
import com.longtailvideo.jwplayer.events.AdCompleteEvent;
import com.longtailvideo.jwplayer.events.AdErrorEvent;
import com.longtailvideo.jwplayer.events.AdImpressionEvent;
import com.longtailvideo.jwplayer.events.AdPauseEvent;
import com.longtailvideo.jwplayer.events.AdPlayEvent;
import com.longtailvideo.jwplayer.events.AdSkippedEvent;
import com.longtailvideo.jwplayer.events.AdTimeEvent;
import com.longtailvideo.jwplayer.events.AudioTrackChangedEvent;
import com.longtailvideo.jwplayer.events.AudioTracksEvent;
import com.longtailvideo.jwplayer.events.BeforeCompleteEvent;
import com.longtailvideo.jwplayer.events.BeforePlayEvent;
import com.longtailvideo.jwplayer.events.BufferEvent;
import com.longtailvideo.jwplayer.events.CaptionsChangedEvent;
import com.longtailvideo.jwplayer.events.CaptionsListEvent;
import com.longtailvideo.jwplayer.events.CompleteEvent;
import com.longtailvideo.jwplayer.events.ControlsEvent;
import com.longtailvideo.jwplayer.events.DisplayClickEvent;
import com.longtailvideo.jwplayer.events.ErrorEvent;
import com.longtailvideo.jwplayer.events.FullscreenEvent;
import com.longtailvideo.jwplayer.events.IdleEvent;
import com.longtailvideo.jwplayer.events.LevelsChangedEvent;
import com.longtailvideo.jwplayer.events.LevelsEvent;
import com.longtailvideo.jwplayer.events.MetaEvent;
import com.longtailvideo.jwplayer.events.MuteEvent;
import com.longtailvideo.jwplayer.events.PauseEvent;
import com.longtailvideo.jwplayer.events.PlayEvent;
import com.longtailvideo.jwplayer.events.PlaylistCompleteEvent;
import com.longtailvideo.jwplayer.events.PlaylistEvent;
import com.longtailvideo.jwplayer.events.PlaylistItemEvent;
import com.longtailvideo.jwplayer.events.RelatedCloseEvent;
import com.longtailvideo.jwplayer.events.RelatedOpenEvent;
import com.longtailvideo.jwplayer.events.RelatedPlayEvent;
import com.longtailvideo.jwplayer.events.SeekEvent;
import com.longtailvideo.jwplayer.events.SeekedEvent;
import com.longtailvideo.jwplayer.events.SetupErrorEvent;
import com.longtailvideo.jwplayer.events.TimeEvent;
import com.longtailvideo.jwplayer.events.VisualQualityEvent;
import com.longtailvideo.jwplayer.events.listeners.AdvertisingEvents;
import com.longtailvideo.jwplayer.events.listeners.VideoPlayerEvents;

/**
 * Outputs all JW Player Events to logging, with the exception of time events.
 */
public class JWEventHandler implements VideoPlayerEvents.OnSetupErrorListener,
        VideoPlayerEvents.OnPlaylistListener,
        VideoPlayerEvents.OnPlaylistItemListener,
        VideoPlayerEvents.OnPlayListener,
        VideoPlayerEvents.OnPauseListener,
        VideoPlayerEvents.OnBufferListener,
        VideoPlayerEvents.OnIdleListener,
        VideoPlayerEvents.OnErrorListener,
        VideoPlayerEvents.OnSeekListener,
        VideoPlayerEvents.OnTimeListener,
        VideoPlayerEvents.OnFullscreenListener,
        VideoPlayerEvents.OnAudioTracksListener,
        VideoPlayerEvents.OnAudioTrackChangedListener,
        VideoPlayerEvents.OnCaptionsListListener,
        VideoPlayerEvents.OnMetaListener,
        VideoPlayerEvents.OnPlaylistCompleteListener,
        VideoPlayerEvents.OnCompleteListener,
        VideoPlayerEvents.OnLevelsChangedListener,
        VideoPlayerEvents.OnLevelsListener,
        VideoPlayerEvents.OnControlsListener,
        VideoPlayerEvents.OnDisplayClickListener,
        VideoPlayerEvents.OnMuteListener,
        VideoPlayerEvents.OnSeekedListener,
        VideoPlayerEvents.OnVisualQualityListener,
        AdvertisingEvents.OnAdClickListener,
        AdvertisingEvents.OnAdCompleteListener,
        AdvertisingEvents.OnAdSkippedListener,
        AdvertisingEvents.OnAdErrorListener,
        AdvertisingEvents.OnAdImpressionListener,
        AdvertisingEvents.OnAdTimeListener,
        AdvertisingEvents.OnAdPauseListener,
        AdvertisingEvents.OnAdPlayListener,
        AdvertisingEvents.OnBeforePlayListener,
        AdvertisingEvents.OnBeforeCompleteListener {

    TextView mOutput;

    public JWEventHandler(JWPlayerView jwPlayerView, TextView output) {
        mOutput = output;
        // Subscribe to all JW Player events
        jwPlayerView.addOnSetupErrorListener(this);
        jwPlayerView.addOnPlaylistListener(this);
        jwPlayerView.addOnPlaylistItemListener(this);
        jwPlayerView.addOnPlayListener(this);
        jwPlayerView.addOnPauseListener(this);
        jwPlayerView.addOnBufferListener(this);
        jwPlayerView.addOnIdleListener(this);
        jwPlayerView.addOnErrorListener(this);
        jwPlayerView.addOnSeekListener(this);
        jwPlayerView.addOnTimeListener(this);
        jwPlayerView.addOnFullscreenListener(this);
        jwPlayerView.addOnLevelsChangedListener(this);
        jwPlayerView.addOnLevelsListener(this);
        jwPlayerView.addOnCaptionsListListener(this);
        jwPlayerView.addOnControlsListener(this);
        jwPlayerView.addOnDisplayClickListener(this);
        jwPlayerView.addOnMuteListener(this);
        jwPlayerView.addOnVisualQualityListener(this);
        jwPlayerView.addOnSeekedListener(this);
        jwPlayerView.addOnAdClickListener(this);
        jwPlayerView.addOnAdCompleteListener(this);
        jwPlayerView.addOnAdSkippedListener(this);
        jwPlayerView.addOnAdErrorListener(this);
        jwPlayerView.addOnAdImpressionListener(this);
        jwPlayerView.addOnAdTimeListener(this);
        jwPlayerView.addOnAdPauseListener(this);
        jwPlayerView.addOnAdPlayListener(this);
        jwPlayerView.addOnMetaListener(this);
        jwPlayerView.addOnPlaylistCompleteListener(this);
        jwPlayerView.addOnCompleteListener(this);
        jwPlayerView.addOnBeforePlayListener(this);
        jwPlayerView.addOnBeforeCompleteListener(this);
    }

    private void updateOutput(String output) {
        mOutput.setText(output);
    }

    /**
     * Regular playback events below here
     */

    @Override
    public void onAudioTracks(AudioTracksEvent audioTracks) {
        updateOutput("onAudioTracks(List<AudioTrack>)");
    }
    @Override
    public void onIdle(IdleEvent oldState) {
        updateOutput("onIdle(" + oldState + ")");
    }

    @Override
    public void onMeta(MetaEvent metadata) {
        updateOutput("onMeta(Metadata)");
    }

    @Override
    public void onPause(PauseEvent oldState) {
        updateOutput("onPause(" + oldState + ")");
    }

    @Override
    public void onPlay(PlayEvent oldState) {
        updateOutput("onPlay(" + oldState + ")");
    }

    @Override
    public void onPlaylistComplete(PlaylistCompleteEvent playlistCompleteEvent) {
        updateOutput("onPlaylistComplete()");
    }

    @Override
    public void onPlaylistItem(PlaylistItemEvent playlistItemEvent) {
        updateOutput("onPlaylistItem("  + ", playlistItemEvent)");
    }

    @Override
    public void onPlaylist(PlaylistEvent playlist) {
        updateOutput("onPlaylist(List<PlaylistItem>)");
    }

    @Override
    public void onSeek(SeekEvent seekedEvent) {
        updateOutput("onSeek("  + ", "  + ")");
    }

    @Override
    public void onSetupError(SetupErrorEvent message) {
        updateOutput("onSetupError(\"" + message.getMessage() + "\")");
    }

    @Override
    public void onTime(TimeEvent timeEvent) {
        // Do nothing - this fires several times per second
    }

    @Override
    public void onAdError(AdErrorEvent adErrorEvent) {
        updateOutput("onAdError(\""  + "\", \""  + "\")");
    }

    @Override
    public void onError(ErrorEvent errorEvent) {
        updateOutput("onError(\"" + errorEvent.getMessage() + "\")");
    }

    @Override
    public void onLevelsChanged(LevelsChangedEvent i) {
        updateOutput("onLevelsChange(" + i + ")");
    }

    @Override
    public void onLevels(LevelsEvent list) {
        updateOutput("onLevels(List<QualityLevel>)");
    }

    @Override
    public void onAudioTrackChanged(AudioTrackChangedEvent i) {
        updateOutput("onAudioTrackChanged(" + i + ")");
    }

    @Override
    public void onAdClick(AdClickEvent adClickEvent) {
        updateOutput("onAdClick(\"" + adClickEvent.getTag() + "\")");
    }

    @Override
    public void onAdComplete(AdCompleteEvent adCompleteEvent) {
        updateOutput("onAdComplete(\"" + adCompleteEvent.getTag() + "\")");
    }

    @Override
    public void onAdSkipped(AdSkippedEvent adSkippedEvent) {
        updateOutput("onAdSkipped(\"" + adSkippedEvent.getTag() + "\")");
    }

    @Override
    public void onAdImpression(AdImpressionEvent adImpressionEvent) {
        updateOutput("onAdImpression(\"" + adImpressionEvent.getTag() + "\", \"" + adImpressionEvent.getCreativeType() + "\", \"" + adImpressionEvent.getAdPosition().name() + "\")");

    }

    @Override
    public void onAdTime(AdTimeEvent adTimeEvent) {
        // Do nothing - this fires several times per second
    }

    @Override
    public void onAdPause(AdPauseEvent adPauseEvent) {
        updateOutput("onAdPause(\"" + adPauseEvent.getTag() + "\", \"" + adPauseEvent.getOldState() + "\")");
    }

    @Override
    public void onAdPlay(AdPlayEvent adPlayEvent) {
        updateOutput("onAdPlay(\"" + adPlayEvent.getTag() + "\", \"" + adPlayEvent.getOldState() + "\")");
    }

    @Override
    public void onControls(ControlsEvent controlsEvent) {
        updateOutput("onControls(\"" + controlsEvent.getControls() + "\")");
    }

    @Override
    public void onDisplayClick(DisplayClickEvent displayClickEvent) {
        updateOutput("onDisplayClick(\"" + "displayClick" + "\")");
    }

    @Override
    public void onMute(MuteEvent b) {
        updateOutput("onMute(\"" + b + "\")");
    }


    @Override
    public void onSeeked(SeekedEvent seekedEvent) {
        updateOutput("onSeeked(\"" + "seeked" + "\")");
    }

    @Override
    public void onVisualQuality(VisualQualityEvent visualQuality) {
        updateOutput("onVisualQuality(\"" + visualQuality.getQualityLevel().getLabel() + "\")");
    }

    @Override
    public void onBeforeComplete(BeforeCompleteEvent beforeCompleteEvent) {
        updateOutput("onBeforeComplete()");
    }

    @Override
    public void onBeforePlay(BeforePlayEvent beforePlayEvent) {
        updateOutput("onBeforePlay()");
    }

    @Override
    public void onBuffer(BufferEvent bufferEvent) {
        updateOutput("BufferEvent()");
    }

    @Override
    public void onCaptionsList(CaptionsListEvent captionsListEvent) {
        updateOutput("onCaptionsList()");
    }

    @Override
    public void onComplete(CompleteEvent completeEvent) {
        updateOutput("onComplete()");
    }

    @Override
    public void onFullscreen(FullscreenEvent fullscreenEvent) {
        updateOutput("onFullscreen()");
    }
}
