package au.com.beba.chainreaction.reactor

import au.com.beba.chainreaction.chain.ChainDecision
import au.com.beba.chainreaction.chain.Reactor
import au.com.beba.chainreaction.decision.PassThroughChainDecision

class PassThroughReactor(override val chainDecision: ChainDecision = PassThroughChainDecision()) : Reactor