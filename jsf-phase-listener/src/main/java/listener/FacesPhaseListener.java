package listener;

import javax.faces.event.PhaseEvent;
import javax.faces.event.PhaseId;
import javax.faces.event.PhaseListener;

public class FacesPhaseListener implements PhaseListener {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 229764191684296973L;

	@Override
	public void afterPhase(PhaseEvent event) {
		
	}
	
	@Override
	public void beforePhase(PhaseEvent event) {
		if (event.getPhaseId().equals(PhaseId.RESTORE_VIEW)) {
			System.out.println("");
		}
		
		System.out.printf("-> beforePhase: %s%n", event.getPhaseId());
	}

	@Override
	public PhaseId getPhaseId() {
		return PhaseId.ANY_PHASE;
	}
	
}
