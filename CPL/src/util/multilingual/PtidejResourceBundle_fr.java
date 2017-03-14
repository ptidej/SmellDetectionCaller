/*******************************************************************************
 * Copyright (c) 2001-2014 Yann-Ga�l Gu�h�neuc and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the GNU Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.gnu.org/licenses/old-licenses/gpl-2.0.html
 * 
 * Contributors:
 *     Yann-Ga�l Gu�h�neuc and others, see in file; API and its implementation
 ******************************************************************************/
package util.multilingual;

import java.util.ListResourceBundle;

/**
 * @author	Mehdi Lahlou
 * @since	05/05/18
 * @version 1.0
 */
public class PtidejResourceBundle_fr extends ListResourceBundle {
	private static final Object[][] CONTENTS =
		{
				// *********** CPL ***********
				{ "CPL::Browser::BROWSER_URL",
						new String("http://www.javaworld.com") },
				{
						"CPL::Browser::Err_BRINGING_BROWSER",
						new String(
							"Erreur lors de l'appel au fureteur avec la commande : {0}") },
				{
						"CPL::Browser::Err_INVOKE_BROWSER",
						new String(
							"Ne peut pas invoquer le fureteur avec la commande : {0}") },
				{ "CPL::ClassLoader::Err_FILE",
						new String("Le fichier {0} a produit une erreur.") },
				{
						"CPL::LogoBytesArrayBuilder::Err_BUILDING_BYTES",
						new String(
							"Erreur lors de la construction du tableau d'octets.") },
				{ "CPL::NameDialog::BUTTON_LABEL", new String("Confirmer") },
				{ "CPL::NameDialog::TITLE", new String("Note") },
				{ "CPL::SubtypeLoader::Err_FILES_NOT_FOUND",
						new String("Loader: Pas de fichier trouv� dans {0}") },
				{
						"CPL::SubtypeLoader::Err_READING_FILE",
						new String(
							"Loader: Erreur lors de la lecture du fichier {0}") },
				{ "CPL::SubtypeLoader::LOADING_FROM",
						new String("Chargement de : {0} \n") },

				// *********** JChoco ***********
				{
						"JChoco::Abstract***IntConstraint::Err_CONSTRAINT_INDEX",
						new String(
							"bogue dans setConstraintIndex i: {0} this: {1}") },
				{
						"JChoco::PalmAssignVar::Err_USING_checkAcceptable",
						new String(
							"PalmAssignVar.checkAcceptable(List) ne devrait pas �tre utilis� !") },
				{
						"JChoco::PalmAssignVar::Err_USING_getNextDecisions",
						new String(
							"PalmAssignVar.getNextDecisions() ne devrait pas �tre utilis� !") },
				{
						"JChoco::PalmAssignVar::Err_USING_learnFromRejection",
						new String(
							"PalmAssignVar.learnFromRejection() ne devrait pas �tre utilis� !") },
				{
						"JChoco::PalmBitSetIntDomain::Err_RESTORE_INF",
						new String(
							"restoreInf ne devrait pas �tre appel� � partir de BitSetIntdomain !") },
				{
						"JChoco::PalmBitSetIntDomain::Err_RESTORE_SUP",
						new String(
							"restoreSup ne devrait pas �tre appel� � partir de BitSetIntdomain !") },
				{
						"JChoco::PalmBitSetIntDomain::Warning_NEED_PARAM",
						new String(
							"PaLM: VAL requiert un autre param�tre dans self_explain (IntVar)") },
				{
						"JChoco::PalmBitSetIntDomain::Warning_NO_PARAM_NEEDED",
						new String(
							"PaLM: INF, SUP ou DOM n'a pas besoin d'un param�tre suppl�mentaire dans self_explain (IntVar)") },
				{
						"JChoco::PalmIntervalIntDomain::Err_RESTORE_VAL",
						new String(
							"restoreVal ne devrait pas �tre appel� � partir de IntervalIntdomain !") },
				{
						"JChoco::PalmIntervalIntDomain::Warning_NEED_PARAM",
						new String(
							"PaLM: VAL requiert un autre param�tre dans self_explain (IntVar)") },
				{
						"JChoco::PalmIntervalIntDomain::Warning_NO_PARAM_NEEDED",
						new String(
							"PaLM: INF, SUP ou DOM n'a pas besoin d'un param�tre suppl�mentaire dans self_explain (IntVar)") },
				{ "JChoco::PalmSolver::CONTRADICTION",
						new String("Contradiction : {0}") },
				{ "JChoco::Problem::Err_INTEXP",
						new String("IntExp n'est ni un terme, ni une variable") },
				{ "JChoco::Problem::Err_INTEXP_NOT_GOOD_EXPR",
						new String("IntExp n'est pas une bonne expression") },
				{ "JChoco::Problem::Err_UNEXPECTED_KIND",
						new String("type de IntExp innatendu") },
				{ "JChoco::Problem::Err_UNKNOWN_KIND",
						new String("type inconnu de IntVar") },
				{
						"JChoco::Solution::Err_RESTORE_SOL",
						new String("BUG in restoring solution !!!!!!!!!!!!!!!!") },
				{ "JChoco::StoredBitSet::IOOBException_LOWER_BOUND",
						new String("fromIndex < 0:") },
				{ "JChoco::StoredBitSet::IOOBException_UPPER_BOUND",
						new String("fromIndex > 32*size:") },
				{ "JChoco::StoredIntVector::IOOBException_INDEX_SIZE",
						new String("Index: {0}, Taille {1}") },
				{ "JChoco::TraceState::CONSTRAINT_ADDED",
						new String("Constraint {0} added.") },
				{ "JChoco::TraceState::CONSTRAINT_REMOVED",
						new String("Constraint {0} removed.") },

				// *********** Metrical Ptidej Solver ***********
				{ "Metrical Ptidej Solver::AbstractFactoryMotif::Problem_FMDM",
						new String("Factory method Design Motif") },
				{ "Metrical Ptidej Solver::AdapterMotif::Problem_ADM",
						new String("Adapter Design Motif") },
				{ "Metrical Ptidej Solver::CommandMotif::Problem_CDM",
						new String("Command Design Motif") },
				{ "Metrical Ptidej Solver::CompositeMotif::Problem_CDM",
						new String("Composite Design Motif") },
				{ "Metrical Ptidej Solver::FactoryMethodMotif::Problem_FMDM",
						new String("Factory method Design Motif") },
				{
						"Metrical Ptidej Solver::Fingerprint::IAException_UNKNOWN_OP",
						new String("Operateur inconnu") },
				{ "Metrical Ptidej Solver::MetricUnknownException::STR",
						new String("Metrique inconnue") },
				{
						"Metrical Ptidej Solver::Problem::USING_METRICS",
						new String(
							"++ Utilisation de metriques pour faire la trace des r�les and ainsi que pour r�duire l'espace de recherche") },

				// *********** PADL Analyses ***********
				{ "PADL Analyses::Repository::LOAD_ANALYSIS",
						new String("Ne peut pas charger l'analyse {0} :\n{1}") },
				{ "PADL Analyses::SystematicUMLAnalysis::ANALYSIS_TIME",
						new String("Temps de l'analyse : {0} ms.") },
				{ "PADL Analyses::SystematicUMLAnalysis::NAME",
						new String("UML Systematique") },

				// *********** PADL AOL Creator ***********
				{ "PADL AOL Creator::AOLCreator::CLASSES",
						new String(" classes...") },
				{ "PADL AOL Creator::AOLCreator::FILTERING_DONE",
						new String("Filterage termin�.") },
				{ "PADL AOL Creator::AOLCreator::PARSING",
						new String("Parsage") },
				{ "PADL AOL Creator::AOLCreator::PARSING_DONE",
						new String("Parsage termin�.") },
				{
						"PADL AOL Creator::AOLLexer::Err_BAD_IN_STREAM_INIT",
						new String(
							"Erreur: Mauvais analyseur de flot d'entr�e.") },
				{
						"PADL AOL Creator::AOLLexer::Err_REPORT",
						new String(
							"Erreur: {0}\nInfo: {1}\nLigne: {2} Char: {3} Texte: \"{4}\"") },
				{ "PADL AOL Creator::AOLLexer::FATAL_ERR",
						new String("Erreur Fatale.\n") },
				{ "PADL AOL Creator::AOLLexer::ILLEGAL_CHAR",
						new String("Charact�re Ill�gal: {}") },
				{
						"PADL AOL Creator::AOLLexer::LEXICAL_ERR",
						new String(
							"Erreur Lexiquale: L'entr�e ne co�ncide pas.") },
				{
						"PADL AOL Creator::AOLParser::INVALID_ACTION_NUMBER",
						new String(
							"Un num�ro d'action invalid a �t� trouv� dans la table de parsage interne") },
				{ "PADL AOL Creator::AOLParser::SYN_ERR",
						new String("Erreur de syntaxe ({0})") },
				{ "PADL AOL Creator::AspectCreator::CALL_AJC",
						new String("> Appel � ajc...") },
				{ "PADL AOL Creator::AspectCreator::COMPILER_FAIL",
						new String("Compilateur - Echec") },
				{ "PADL AOL Creator::AspectCreator::TERM_AJC",
						new String("> ajc termine...") },
				{ "PADL AOL Creator::ClassScope::TYPE_NAME",
						new String("ClassScope.IsTypeName: {0}") },
				{
						"PADL AOL Creator::PADL ClassFile Creator::TYPE_VAL",
						new String(
							"Une instance de MethodInvocation doit avoir un type connu (ici, {0} )") },

				// *********** PADL ***********
				{
						"PADL::ChainOfResponsibility::INTENT",
						new String(
							"Eviter de coupler la source d'une requ�te\n� sa destination en donnant la chance\n� plus d'un objet de pouvoir traiter\nla requ�te. Cha�ner les objets receveurs\net passer la requ�te � travers\nla cha�ne jusqu'� ce qu'un objet la traite.") },
				{ "PADL::Class::ALREADY_IMPL",
						new String("{0} est deja implement� par {1}") },
				{ "PADL::Class::NOT_IMPL",
						new String("{0} n'est pas implement� par {1}") },
				{
						"PADL::Composite::Err_INIT_ALMD",
						new String(
							"Erreur: ne peut initialiser le det�cteur du AbstractLevelModel.") },
				{
						"PADL::Composite::INTENT",
						new String(
							"Composer les objets en arbre de structures\npour representer les hierarchies part-whole.\nComposite permet aux clients de traiter les objets individuels\n et les compositions d'objets\nuniform�ment.") },
				{ "PADL::Constituent::ACTOR_ID_NULL",
						new String("Un actorID ne peut �tre nul") },
				{ "PADL::Constituent::ELEM_ABSTRACT",
						new String("Cet element ne peut �tre abstrait") },
				{
						"PADL::Constituent::ELEM_CODE_DEF",
						new String(
							"Cet element ne peut contenir de la d�finition de code") },
				{ "PADL::Constituent::Exception_ACCEPT_METHOD",
						new String("M�thode accept : {0} ({1})") },
				{
						"PADL::Constructor+Destcuctor::PARAM_OR_METHOD_ADD",
						new String(
							"Seulement un param�tre ou l'invoquation d'une m�thode peuvent �tre ajout�s � une m�thode.") },
				{
						"PADL::ContainerAggregation::ELEMS_ATTACH",
						new String(
							"Seulement, les �l�ments peuvent �tre attach�s � une aggregation conteneuse lors d'une instantiation.") },
				{ "PADL::DelegatingMethod::ABSTRACT",
						new String("{0} ne peut �tre abstrait.") },
				{
						"PADL::DesignLevelModel::ENT_OR_PATTERN_ADD",
						new String(
							"Seulement les entit�s ou les \"pattern\" peuvent �tre ajout�s � un model de niveau conception.") },
				{ "PADL::Element::ATTACH",
						new String("{0} ne peut �tre attach� � {1}") },
				{
						"PADL::Element::ELEM_ATTACH",
						new String(
							"Un element ne peut �tre attach� � lui m�me.") },
				{ "PADL::Entity::ALREADY_INHERITED",
						new String("{0} est deja h�rit� par {1}") },
				{
						"PADL::Entity::ELEM_ADD_ENT",
						new String(
							"Seulement les elements peuvent �tre ajout�s � une entit�.") },
				{ "PADL::Entity::ENT_INHERIT_ITSELF",
						new String("Une entit� ne peut h�riter d'elle m�me") },
				{
						"PADL::Facade::INTENT",
						new String(
							"Fournis une interface unique � un ensemble \nd'interfaces dans un sous syst�me.\nFacade d�finit une interface de haut niveau\npermettant au sous syst�me une facilit� d'utilisation.") },
				{
						"PADL::Factory::ADD",
						new String(
							"Ne peut ajouter un tableau ou des types primitifs.") },
				{
						"PADL::FactoryMethod::INTENT",
						new String(
							"D�finit une interface pour la cr�ation\nd'une famille d'objets, tout en laissant les sous classes le choix de d�cider\nquelle classe � instancier.\nFactory Method donne le choix � une class de laisser\nl'instantiation aux sous-classes.") },
				{
						"PADL::Field::CARDINALITY",
						new String(
							"La cardinalit� d'un champ doit �tre un ou plusieurs (Ici, {0})") },
				{
						"PADL::GlobalField::CARDINALITY",
						new String(
							"La cardinalit� d'un champ global doit �tre un ou plusieurs (Ici, {0})") },
				{
						"PADL::GoodInheritance::INTENT",
						new String(
							"D�finit qu'une super classe doit compl�tement ignorer\n ses sous classes.") },
				{
						"PADL::IdiomLevelModel::ENT_ADD_ORG_LEVEL",
						new String(
							"Seulement les entit�s peuvent �tre ajout�es � mod�le de niveau organisation.") },
				{
						"PADL::Mediator::INTENT",
						new String(
							"D�finit un objet encapsulant\ncomment un ensemble d'objets peuvent interagir.\nMediator promouvoit le couplage faible en faisant en sorte que ces derni�rs\nne se referrent entre eux explicitment,\net vous laisse varier leur interaction independemment.") },
				{
						"PADL::Memento::INTENT",
						new String(
							"Sans violer l'encapsulation, capture\net externalise l'�tat interne d'un objet\npour qu'il puisse �tre remis � cet �tat plustard.") },
				{
						"PADL::Observer::ConcreteObserver_CLASS_PURPOSE",
						new String(
							"1. Maintient une r�ference � un objet ConcreteSubject\n2. Emmagasiner l'�tat qui doit rester consistant avec le sujet\n3. Implemente l'Observateur mettant � jout l'interface pour garder son �tat consistant avec le sujet") },
				{
						"PADL::Observer::ConcreteSubject_CLASS_PURPOSE",
						new String(
							"1. Emmagasiner l'�tat d'interet aux objets ConcreteObserver\n2. Envoie une notification � ses observateurs lors d'un changement d'�tat") },
				{
						"PADL::Observer::DELEG_METHOD_COMMENT",
						new String(
							"Ajouter une op�ration specifique � cette m�thode") },
				{
						"PADL::Observer::IDIOM",
						new String(
							"Existe dans le paquetage java.util comme classe observatrice.") },
				{
						"PADL::Observer::INTENT",
						new String(
							"D�finit une d�pendance un-�-plusieurs\nentre les objets.\nQuand un objet change d'�tat,\ntout ses dependants sont notifi�s\net mis � jour automatiquement.") },
				{
						"PADL::Observer::Observer_PURPOSE",
						new String(
							"Definit une interface commune aux objets qui doivent �tre notifi�s quand le sujet change.") },
				{
						"PADL::Observer::Subject_PURPOSE",
						new String(
							"1. Conna�t  ses observateurs. Tout objet Observateur peut observer un sujet\n2. Fournit une interface pour attacher et d�tacher les objets Observateurs") },
				{
						"PADL::PatternModel::ENT_ADD_MODEL",
						new String(
							"Seuelemnt une entit� peut �tre ajout�e � un mod�le.") },
				{
						"PADL::PatternModel::Err_INIT_ALMD",
						new String(
							"Erreur: ne peut initialiser le detecteur AbstractLevelModel.") },
				{
						"PADL::Proxy::INTENT",
						new String(
							"Fournit un objet intermediaire pour l'acc�s.") },
				{
						"PADL::Relationship::CARDINALITY",
						new String(
							"La cardinalit� d'une relation doit �tre un ou plus (Ici, {0})") },
				{ "PADL::Visitor::INTENT",
						new String("(Voir le livre de GoF.)") },

				// *********** Ptidej Solver 4 ***********
				{ "Ptidej Solver 4::BitString::NB_OF_BITS",
						new String("Le nombre de bits doit �tre {0}") },
				{
						"Ptidej Solver 4::InteractiveBranching::ANOTHER_SOL",
						new String(
							"D�sirez-vous avoir une autre solution? (y/n) [\"y\" pour Oui]/[\"n\" pour Non]") },
				{ "Ptidej Solver 4::InteractiveBranching::SOL",
						new String("> Solution {0} :") },
				{
						"Ptidej Solver 4::InteractiveRepair::CONST_CONTRADICTION",
						new String(
							"La(les) contrainte(s) suivante(s) occasionnent une contradiction:") },
				{
						"Ptidej Solver 4::InteractiveRepair::NO_MORE_SOL",
						new String(
							"Il y'a plus d'une solution � cause de la contrainte") },
				{ "Ptidej Solver 4::InteractiveRepair::TO_BE_REPLACED",
						new String("Doit �tre replac� par: {0}") },
				{
						"Ptidej Solver 4::InteractiveRepair::WHICH_TO_PUT_BACK",
						new String(
							"Laquelle voullez-vous r�tablir? (-1 -> none)") },
				{
						"Ptidej Solver 4::InteractiveRepair::WHICH_TO_RELAX",
						new String(
							"Laquelle voullez-vous relaxer? (-1 -> none)") },
				{
						"Ptidej Solver 4::Problem::PTIDEJ",
						new String(
							"++ JPtidejSolver v1.0 (D�cembre, 2004), Copyright (c) 2001-2004 Y.-G. Gu�h�neuc\n++ Constraint programming for design patterns and design defects identification") },
				{
						"Ptidej Solver 4::SimpleInteractiveRepair::NO_MORE_SOL",
						new String(
							"Il n ya plus de solution � cause de la contrainte: {0}") },
				{
						"Ptidej Solver 4::SimpleInteractiveRepair::WHICH_TO_RELAX",
						new String(
							"Laquelle voullez-vous relaxer? (-1 -> none)") },

				// *********** Ptidej UI Analyses ***********
				{
						"Ptidej UI Analyses::DifferenceHighlighterFromClasses::DIALOG_TITLE",
						new String(
							"Choisissez un fichier avec des differences dans le model") },
				{ "Ptidej UI Analyses::DifferenceHighlighterFromClasses::NAME",
						new String("Diff�rences entre mod�le (classes)") },
				{
						"Ptidej UI Analyses::DifferenceHighlighterFromMethods::DIALOG_TITLE",
						new String(
							"Choisissez un fichier avec des differences dans le model") },
				{ "Ptidej UI Analyses::DifferenceHighlighterFromMethods::NAME",
						new String("Diff�rences entre mod�le (m�thods)") },
				{
						"Ptidej UI Analyses::HighlighterFromMethods::Err_UNKNOWN_KEY",
						new String("Cl� inconnue dans le fichier : {0}") },
				{
						"Ptidej UI Analyses::Management::Err_METHODE_NOT_FOUND_IN_ENTITY",
						new String(
							"Ne peut trouver la m�thode \"{0}\" dans l'entit� {1}") },
				{ "Ptidej UI Analyses::ModelComparator::DIALOG_TITLE",
						new String("Choisissez un fichier AOL") },
				{ "Ptidej UI Analyses::ModelComparator::NAME",
						new String("Comparison de models AOL") },
				{ "Ptidej UI Analyses::Repository::Err_LOAD_ANALYSIS",
						new String("Ne peut charger l'analyse {0} :{1}") },

				// *********** Ptidej UI Viewer Extensions ***********
				{
						"Ptidej UI Viewer Extensions::CSVGraphReader::Err_SYNTAX_ERR",
						new String("Erreur de syntaxe � la ligne {0}") },
				{
						"Ptidej UI Viewer Extensions::CSVGraphReader::Err_UNEXPECTED_TOKEN",
						new String(
							"Token innatendu {0} � �t� l� du flot, un mot �tait attendu") },
				{ "Ptidej UI Viewer Extensions::POMCalculator::COMPUTE_TIME",
						new String("Metriques calcul�es en {0} ms.\n{1}") },
				{ "Ptidej UI Viewer Extensions::Repository::LOAD_EXTENSION",
						new String("Ne peut charger l'extension {0} :\n{1}") },

				// *********** Ptidej UI Viewer Plugin ***********
				{
						"Ptidej UI Viewer Plugin::AddFolderAction::Err_Exception_OPEN_DIAGRAM_EDITOR",
						new String(
							"throwable exception lors de l'ouverture de DiagramEditor!") },
				{
						"Ptidej UI Viewer Plugin::AddFolderAction::Err_INIT_DIAGRAM_EDITOR",
						new String(
							"(class: PopActionClass) ne peut initialiser l'�diteur de diagramme!") },
				{
						"Ptidej UI Viewer Plugin::AddFolderAction::Err_OPEN_DIAGRAM_EDITOR",
						new String(
							"Erreur lors de l'ouverture de DiagramEditor!") },
				{
						"Ptidej UI Viewer Plugin::AddFolderAction::MessageDialog_CONTENT",
						new String(
							"Ptidej Viewer: Pas de fichiers .class trouv�s dans :\n{0}\nAction: {1}") },
				{
						"Ptidej UI Viewer Plugin::AddFolderAction::MessageDialog_TITLE",
						new String("Ptidej Viewer") },
				{
						"Ptidej UI Viewer Plugin::AddFolderAction::NO_CLASSFILE_FOUND",
						new String("Pas de fichiers .class trouv�s dans: {0}") },
				{
						"Ptidej UI Viewer Plugin::AddJavaAction::Err_Exception_IN_RUN",
						new String("Exception dans run()") },
				{
						"Ptidej UI Viewer Plugin::AddJavaAction::Err_INIT_DIAGRAM_EDITOR",
						new String("Ne peut initialiser DiagramEditor") },
				{
						"Ptidej UI Viewer Plugin::AddJavaAction::Err_NPException_IN_RUN",
						new String("NullPointerException dans run()") },
				{ "Ptidej UI Viewer Plugin::AddJavaAction::Err_TException",
						new String("Thorowable Exception") },
				{
						"Ptidej UI Viewer Plugin::AddJDTPackage::Err_Exception_IN_RUN",
						new String("Exception dans run()") },
				{
						"Ptidej UI Viewer Plugin::AddJDTPackage::Err_INIT_DIAGRAM_EDITOR",
						new String("Ne peut initialiser DiagramEditor") },
				{
						"Ptidej UI Viewer Plugin::AddJDTPackage::Err_NPException_IN_RUN",
						new String("NullPointerException dans run()") },
				{ "Ptidej UI Viewer Plugin::AddJDTPackage::Err_TException",
						new String("Thorowable Exception") },
				{
						"Ptidej UI Viewer Plugin::AddJDTPackageAction::Err_Exception_IN_RUN",
						new String("Exception dans run()") },
				{
						"Ptidej UI Viewer Plugin::AddJDTPackageAction::Err_INIT_DIAGRAM_EDITOR",
						new String("Ne peut initialiser DiagramEditor") },
				{
						"Ptidej UI Viewer Plugin::AddJDTPackageAction::Err_NPException_IN_RUN",
						new String("NullPointerException dans run()") },
				{
						"Ptidej UI Viewer Plugin::AddJDTPackageAction::Err_TException",
						new String("Thorowable Exception") },
				{
						"Ptidej UI Viewer Plugin::AddJDTPackageAction::MessageDialog_CONTENT",
						new String(
							"Ptidej Viewer: Pas de fichiers .class trouv�s dans :\n{0}\nAction: {1}") },
				{
						"Ptidej UI Viewer Plugin::AddJDTPackageAction::MessageDialog_TITLE",
						new String("Ptidej Viewer") },
				{
						"Ptidej UI Viewer Plugin::AddJDTPackageAction::NO_CLASSFILE_FOUND",
						new String("PAs de fichiers .class trouv�s dans : {0}") },
				{
						"Ptidej UI Viewer Plugin::AddNewFolderAction::Err_Exception_OPEN_DIAGRAM_EDITOR",
						new String(
							"throwable exception lors de l'ouverture de DiagramEditor!") },
				{
						"Ptidej UI Viewer Plugin::AddNewFolderAction::Err_INIT_DIAGRAM_EDITOR",
						new String(
							"(class: PopActionClass) Ne peut initialiser l'�diteur de diagram!") },
				{
						"Ptidej UI Viewer Plugin::AddNewFolderAction::Err_OPEN_DIAGRAM_EDITOR",
						new String(
							"Erreur lors de l'ouverture de DiagramEditor!") },
				{
						"Ptidej UI Viewer Plugin::AddNewFolderAction::MessageDialog_CONTENT",
						new String(
							"Ptidej Viewer: Pas de fichiers .class trouv�s dans :\n{0}\nAction: {1}") },
				{
						"Ptidej UI Viewer Plugin::AddNewFolderAction::MessageDialog_TITLE",
						new String("Ptidej Viewer") },
				{
						"Ptidej UI Viewer Plugin::AddNewFolderAction::NO_CLASSFILE_FOUND",
						new String("Pas de fichiers .class trouv�s dans: {0}") },
				{
						"Ptidej UI Viewer Plugin::AddNewJavaAction::Err_Exception_IN_RUN",
						new String("Exception dans run()") },
				{
						"Ptidej UI Viewer Plugin::AddNewJavaAction::Err_INIT_DIAGRAM_EDITOR",
						new String("Ne peut initialiser DiagramEditor") },
				{
						"Ptidej UI Viewer Plugin::AddNewJavaAction::Err_NPException_IN_RUN",
						new String("NullPointerException dans run()") },
				{ "Ptidej UI Viewer Plugin::AddNewJavaAction::Err_TException",
						new String("Thorowable Exception") },
				{
						"Ptidej UI Viewer Plugin::AddNewJDTPackage::Err_Exception_IN_RUN",
						new String("Exception dans run()") },
				{
						"Ptidej UI Viewer Plugin::AddNewJDTPackage::Err_INIT_DIAGRAM_EDITOR",
						new String("Ne peut initialiser DiagramEditor") },
				{
						"Ptidej UI Viewer Plugin::AddNewJDTPackage::Err_NPException_IN_RUN",
						new String("NullPointerException dans run()") },
				{ "Ptidej UI Viewer Plugin::AddNewJDTPackage::Err_TException",
						new String("Thorowable Exception") },
				{
						"Ptidej UI Viewer Plugin::AddNewJDTPackageAction::Err_Exception_OPEN_DIAGRAM_EDITOR",
						new String(
							"throwable exception lors de l'ouverture de DiagramEditor!") },
				{
						"Ptidej UI Viewer Plugin::AddNewJDTPackageAction::Err_INIT_DIAGRAM_EDITOR",
						new String(
							"(class: PopActionClass) Ne peut initialiser l'�diteur de diagrammes!") },
				{
						"Ptidej UI Viewer Plugin::AddNewJDTPackageAction::Err_OPEN_DIAGRAM_EDITOR",
						new String("Erreur lors de l'ouverture DiagramEditor!") },
				{
						"Ptidej UI Viewer Plugin::AddNewJDTPackageAction::MessageDialog_CONTENT",
						new String(
							"Ptidej Viewer: Pas de fichiers .class trouv�s dans :\n{0}\nAction: {1}") },
				{
						"Ptidej UI Viewer Plugin::AddNewJDTPackageAction::MessageDialog_TITLE",
						new String("Ptidej Viewer") },
				{
						"Ptidej UI Viewer Plugin::AddNewJDTPackageAction::NO_CLASSFILE_FOUND",
						new String("Pas de fichiers .class trouv�s dans: {0}") },
				{
						"Ptidej UI Viewer Plugin::AddSelectedPackageAction::Err_Exception_OPEN_DIAGRAM_EDITOR",
						new String(
							"throwable exception lors de l'ouverture de DiagramEditor!") },
				{
						"Ptidej UI Viewer Plugin::AddSelectedPackageAction::Err_INIT_DIAGRAM_EDITOR",
						new String(
							"(class: PopActionClass) Ne peut initialiser l'�diteur de diagramme!") },
				{
						"Ptidej UI Viewer Plugin::AddSelectedPackageAction::Err_OPEN_DIAGRAM_EDITOR",
						new String(
							"Erreur lors de l'ouverture de DiagramEditor!") },
				{
						"Ptidej UI Viewer Plugin::AddSelectedPackageAction::MessageDialog_CONTENT",
						new String(
							"Ptidej Viewer: PAs de fichiers .class trouv�s dans :\n{0}\nAction: {1}") },
				{
						"Ptidej UI Viewer Plugin::AddSelectedPackageAction::MessageDialog_TITLE",
						new String("Ptidej Viewer") },
				{
						"Ptidej UI Viewer Plugin::AddSelectedPackageAction::NO_CLASSFILE_FOUND",
						new String("Pas de fichiers .class trouv�s dans: {0}") },
				{ "Ptidej UI Viewer Plugin::DiagramEditor::CANVAS_IS_NULL",
						new String("Canvas = NUL") },
				{ "Ptidej UI Viewer Plugin::DiagramEditor::CANVAS_NOT_NULL",
						new String("Canvas != NUL") },
				{
						"Ptidej UI Viewer Plugin::DiagramEditor::Err_FILE_NOT_FOUND",
						new String(
							"Erreur: Ne peut trouver le fichier s�lectionn�!") },
				{
						"Ptidej UI Viewer Plugin::DiagramEditor::Err_INVALID_INPUT",
						new String(
							"Entr�e invalide: doit �tre IFileEditorInput") },
				{ "Ptidej UI Viewer Plugin::DiagramEditor::PROJECT_NAME",
						new String("Fichier 1") },
				{ "Ptidej UI Viewer Plugin::FileList::DEFAULT_SELECT",
						new String("S�lection pas d�faut") },
				{
						"Ptidej UI Viewer Plugin::FindConcretePatterns::MessageDialog_CONTENT",
						new String("Action: {0}") },
				{
						"Ptidej UI Viewer Plugin::FindConcretePatterns::MessageDialog_TITLE",
						new String("Ptidej Viewer") },
				{
						"Ptidej UI Viewer Plugin::GUIOptions::Button_FIND_CONCRETE_PATTERNS",
						new String("Trouver les patterns concrets") },
				{ "Ptidej UI Viewer Plugin::GUIOptions::Button_GEN_EXEC_INFO",
						new String("Generer les informations d'�xecution") },
				{ "Ptidej UI Viewer Plugin::GUIOptions::Button_GEN_MODEL",
						new String("Generer le model") },
				{
						"Ptidej UI Viewer Plugin::GUIOptions::Button_LOAD_CONCRETE_PATTERNS",
						new String("Charger les patterns concrets") },
				{
						"Ptidej UI Viewer Plugin::GUIOptions::Button_MODIFY_STRUCTURE",
						new String("Modifier la structure") },
				{
						"Ptidej UI Viewer Plugin::GUIOptions::Button_REMOVE_ALL_CONCRETE_PATTERNS",
						new String("Enlever tout les patterns concrets") },
				{ "Ptidej UI Viewer Plugin::GUIOptions::Button_SHOW_SOLUTIONS",
						new String("Afficher les solutions") },
				{
						"Ptidej UI Viewer Plugin::GUIOptions::FILE_DIALOG_TITLE",
						new String(
							"Choisir le fichier des r�sulats des contraintes") },
				{ "Ptidej UI Viewer Plugin::GUIOptions::Group_OPTIONS",
						new String("Options") },
				{ "Ptidej UI Viewer Plugin::NewProject::MessageDialog_CONTENT",
						new String("Action: {0}") },
				{ "Ptidej UI Viewer Plugin::NewProject::MessageDialog_TITLE",
						new String("JTU Viewer") },
				{
						"Ptidej UI Viewer Plugin::PopActionClass::Err_INIT_DIAGRAM_EDITOR",
						new String(
							"(class: PopActionClass) ne peut initialiser Diagram Editor!") },
				{
						"Ptidej UI Viewer Plugin::PopActionClass::Err_OPEN_DIAGRAM_EDITOR",
						new String(
							"Erreur lors de l'ouverture de DiagramEditor!") },
				{
						"Ptidej UI Viewer Plugin::PopActionJar::Err_INIT_DIAGRAM_EDITOR",
						new String(
							"(class: PopActionJar) la vue ne peut initialiser le Diagram Editor!") },
				{
						"Ptidej UI Viewer Plugin::PopActionJava::Err_Exception_IN_RUN",
						new String("Exception dans run()") },
				{
						"Ptidej UI Viewer Plugin::PopActionJava::Err_INIT_DIAGRAM_EDITOR",
						new String("Ne peut initialiser le DiagramEditor") },
				{
						"Ptidej UI Viewer Plugin::PopActionJava::Err_NPException_IN_RUN",
						new String("NullPointerException dans run()") },
				{
						"Ptidej UI Viewer Plugin::PopActionJavaPackage::Err_Exception_IN_RUN",
						new String("Exception dans run()") },
				{
						"Ptidej UI Viewer Plugin::PopActionJavaPackage::Err_INIT_DIAGRAM_EDITOR",
						new String("Ne peut initialiser DiagramEditor") },
				{
						"Ptidej UI Viewer Plugin::PopActionJavaPackage::Err_NPException_IN_RUN",
						new String("NullPointerException dans run()") },
				{
						"Ptidej UI Viewer Plugin::PopActionNewClass::Err_INIT_DIAGRAM_EDITOR",
						new String(
							"(class: PopActionNewClass) Le diagramme ne peut etre initialis�") },
				{
						"Ptidej UI Viewer Plugin::PopActionNewJar::Err_INIT_DIAGRAM_EDITOR",
						new String(
							"(class: PopActionJar) la vue ne peut �tre initialis�e") },
				{
						"Ptidej UI Viewer Plugin::PopActionNewJava::Err_Exception_IN_RUN",
						new String("Exception dans run()") },
				{
						"Ptidej UI Viewer Plugin::PopActionNewJava::Err_INIT_DIAGRAM_EDITOR",
						new String("Ne peut initialiser le DiagramEditor") },
				{
						"Ptidej UI Viewer Plugin::PopActionNewJavaPackage::Err_Exception_IN_RUN",
						new String("Exception dans run()") },
				{
						"Ptidej UI Viewer Plugin::PopActionNewJavaPackage::Err_INIT_DIAGRAM_EDITOR",
						new String("Ne peut initialiser DiagramEditor") },
				{
						"Ptidej UI Viewer Plugin::PopActionNewJavaPackage::Err_NPException_IN_RUN",
						new String("NullPointerException dans run()") },
				{
						"Ptidej UI Viewer Plugin::PopActionNewPackage::Err_Exception_INIT_DIAGRAM_EDITOR",
						new String(
							"Une erreur est survenue lors de l'initialisation de DiagramEditor") },
				{
						"Ptidej UI Viewer Plugin::PopActionNewPackage::Err_INIT_DIAGRAM_EDITOR",
						new String(
							"(class: PopActionNewPackage) le diagramme ne peut �tre initialis�") },
				{
						"Ptidej UI Viewer Plugin::PopActionNewPtidej::Err_INIT_DIAGRAM_EDITOR",
						new String(
							"(class: PopActionNewPtidej) le diagramme ne peut �tre initialis�") },
				{
						"Ptidej UI Viewer Plugin::PopActionPackage::Err_INIT_DIAGRAM_EDITOR",
						new String(
							"(class: PopActionPackage)  ne peut initialiser le Diagram Editor!") },
				{
						"Ptidej UI Viewer Plugin::PopActionPackage::Err_OPEN_DIAGRAM_EDITOR",
						new String(
							"Erreur lors de l'ouverture de DiagramEditor!") },
				{
						"Ptidej UI Viewer Plugin::PopActionPtidej::Err_INIT_DIAGRAM_EDITOR",
						new String(
							"(class: PopActionPtidej) Ne peut initialiser le Diagram Editor!") },
				/**/{
						"Ptidej UI Viewer Plugin::Preferences::AGGREGATION_DISPLAY",
						new String("Affichage des aggregations") },
				{ "Ptidej UI Viewer Plugin::Preferences::AGGREGATION_NAMES",
						new String("Noms des aggregations") },
				{ "Ptidej UI Viewer Plugin::Preferences::ASSOCIATION_DISPLAY",
						new String("Affichage des associations") },
				{ "Ptidej UI Viewer Plugin::Preferences::ASSOCIATION_NAMES",
						new String("Noms des associations") },
				{ "Ptidej UI Viewer Plugin::Preferences::COMPOSITION_DISPLAY",
						new String("Affichage des composition") },
				{ "Ptidej UI Viewer Plugin::Preferences::COMPOSITION_NAMES",
						new String("Noms des compositions") },
				{
						"Ptidej UI Viewer Plugin::Preferences::CONTAINER_AGGREGATION_DISPLAY",
						new String("Affichage des aggregations conteneuses") },
				{
						"Ptidej UI Viewer Plugin::Preferences::CONTAINER_AGGREGATION_NAMES",
						new String("Noms des aggregation conteneuses") },
				{
						"Ptidej UI Viewer Plugin::Preferences::CONTAINER_COMPOSITION_DISPLAY",
						new String("Affichage des compositions conteneuses") },
				{
						"Ptidej UI Viewer Plugin::Preferences::CONTAINER_COMPOSITION_NAMES",
						new String("Noms des compositions conteneuses") },
				{ "Ptidej UI Viewer Plugin::Preferences::CREATION_DISPLAY",
						new String("Affichage de cr�ation") },
				{ "Ptidej UI Viewer Plugin::Preferences::CREATION_NAMES",
						new String("Noms de cr�ation") },
				{ "Ptidej UI Viewer Plugin::Preferences::FIELD_NAMES",
						new String("Noms du champ") },
				{
						"Ptidej UI Viewer Plugin::Preferences::FULLY_QUALIFIED_NAMES",
						new String("Noms complets") },
				{
						"Ptidej UI Viewer Plugin::Preferences::GHOST_ENTITIES_DISPLAY",
						new String("Affichage des entit�s font�mes") },
				{ "Ptidej UI Viewer Plugin::Preferences::HIERARCHY_DISPLAY",
						new String("Affichage de la hierarchie") },
				{ "Ptidej UI Viewer Plugin::Preferences::HIERARCHY_NAMES",
						new String("Noms de la hierarchie") },
				{ "Ptidej UI Viewer Plugin::Preferences::USE_DISPLAY",
						new String("Affichage des utilisations") },
				{ "Ptidej UI Viewer Plugin::Preferences::USE_NAMES",
						new String("Affichage des noms des utilisations") },
				{ "Ptidej UI Viewer Plugin::Preferences::METHOD_NAMES",
						new String("Noms de m�thodes") },
				{
						"Ptidej UI Viewer Plugin::PtidejDiagramEditor::Err_INVALID_INPUT",
						new String(
							"Entr�e invalide: doit �tre IFileEditorInput") },
				{ "Ptidej UI Viewer Plugin::PtidejDiagramEditor::LOADING_TIME",
						new String("Temps de chargement: {0} ms.\n\n") },
				{
						"Ptidej UI Viewer Plugin::PtidejDiagramEditor::STATISTICS",
						new String(
							"\nStatistiques:\n{0}\n              M�moire totale\tM�moire libre\nAvant la construction  {1}\t\t{2}\t\t{3}\nApr�s la construction  {4}\t\t{5}\t\t{6}\nApr�s l\'affichage       {7}\t\t{8}\t\t{9}\n") },
				{
						"Ptidej UI Viewer Plugin::RemoveConcretePatterns::MessageDialog_CONTENT",
						new String("Action: {0}") },
				{
						"Ptidej UI Viewer Plugin::RemoveConcretePatterns::MessageDialog_TITLE",
						new String("Ptidej Viewer") },
				{
						"Ptidej UI Viewer Plugin::SaveProject::MessageDialog_CONTENT",
						new String("Action: {0}") },
				{ "Ptidej UI Viewer Plugin::SaveProject::MessageDialog_TITLE",
						new String("Ptidej Viewer") },

				// *********** Ptidej UI Viewer Standalone ***********
				{
						"Ptidej UI Viewer Standalone::ConstraintViewerPanel::CHECKBOXES_TEXTS_R01",
						new String("Probl�me personnalis�") },
				{
						"Ptidej UI Viewer Standalone::ConstraintViewerPanel::CHECKBOXES_TEXTS_R02",
						new String("Probl�me AC-4") },
				{
						"Ptidej UI Viewer Standalone::ConstraintViewerPanel::CHECKBOXES_TEXTS_R03",
						new String("Solveur automatiue simple") },
				{
						"Ptidej UI Viewer Standalone::ConstraintViewerPanel::CHECKBOXES_TEXTS_R04",
						new String("Solveur automatique combinatorial") },
				{
						"Ptidej UI Viewer Standalone::ConstraintViewerPanel::CHECKBOXES_TEXTS_R05",
						new String("Solveur automatique") },
				{
						"Ptidej UI Viewer Standalone::ConstraintViewerPanel::FILE_DIALOG_CHOOSE_CRF_TITLE",
						new String(
							"Choisir le fichier de resultat des contraintes") },
				{
						"Ptidej UI Viewer Standalone::ConstraintViewerPanel::FILE_DIALOG_SAVE_MODEL_TITLE",
						new String("Sauvegarder le domaine Claire sous...") },
				{
						"Ptidej UI Viewer Standalone::ConstraintViewerPanel::FIND_SIMILAR_MA_TEXT",
						new String(
							"Trouver les micro-architectures  similaires") },
				{
						"Ptidej UI Viewer Standalone::ConstraintViewerPanel::GENERATE_PROGRAM_MODEL",
						new String("G�nerer le model du programme") },
				{
						"Ptidej UI Viewer Standalone::ConstraintViewerPanel::GENERATE_SOLVER_DATA_TEXT",
						new String("G�nerer les donn�es d'�xecution du solveur") },
				{
						"Ptidej UI Viewer Standalone::ConstraintViewerPanel::HELP_PTIDEJSOLVER3",
						new String(
							"http://www.iro.umontreal.ca/~ptidej/Publications/Documents/IJCAI01MSPC.doc.pdf") },
				{
						"Ptidej UI Viewer Standalone::ConstraintViewerPanel::HELP_PTIDEJSOLVER4",
						new String(
							"http://www.yann-gael.gueheneuc.net/Work/Tutoring/Documents/040924+JPtidejSolver.doc.pdf") },
				{
						"Ptidej UI Viewer Standalone::ConstraintViewerPanel::HELP_PTIDEJSOLVER4_METRICAL",
						new String(
							"http://www.iro.umontreal.ca/~ptidej/Publications/Documents/WCRE04.doc.pdf") },
				{
						"Ptidej UI Viewer Standalone::ConstraintViewerPanel::LIST_ALL_MA_TEXT",
						new String("Lister les micro-architectures similaires") },
				{
						"Ptidej UI Viewer Standalone::ConstraintViewerPanel::LOAD_MA_TEXT",
						new String("Charger les micro-architectures similaires") },
				{
						"Ptidej UI Viewer Standalone::ConstraintViewerPanel::MODIFY_PROGRAM_MODEL_TEXT",
						new String("Modifier le model du programme") },
				{
						"Ptidej UI Viewer Standalone::ConstraintViewerPanel::PTIDEJSOLVER_ALL_TEXT",
						new String("Solveurs Ptidej") },
				{
						"Ptidej UI Viewer Standalone::ConstraintViewerPanel::PTIDEJSOLVER3_TEXT",
						new String("Ptidej Solveur 3") },
				{
						"Ptidej UI Viewer Standalone::ConstraintViewerPanel::PTIDEJSOLVER4_METRICAL_TEXT",
						new String("Ptidej Solveur de m�triques 4") },
				{
						"Ptidej UI Viewer Standalone::ConstraintViewerPanel::PTIDEJSOLVER4_TEXT",
						new String("Ptidej Solveur 4") },
				{
						"Ptidej UI Viewer Standalone::ConstraintViewerPanel::REMOVE_ALL_MA_TEXT",
						new String(
							"Enlever toutes les micro-architectures similaires") },
				{
						"Ptidej UI Viewer Standalone::MetricResultsActionListener::FOLD_UNFOLD",
						new String("Plier/D�plier") },
				{
						"Ptidej UI Viewer Standalone::MetricResultsActionListener::FOLD_UNFOLD_ALL",
						new String("Plier/D�plier Tout") },
				{
						"Ptidej UI Viewer Standalone::MetricResultsActionListener::GO_TO",
						new String("Aller �") },
				{
						"Ptidej UI Viewer Standalone::MetricResultsActionListener::SHOW_HIDE",
						new String("Afficher/Cacher") },
				{
						"Ptidej UI Viewer Standalone::MetricResultsFrame::Lbl_COMPONENT_LABEL",
						new String("Metrique {0} = {1}") },
				{
						"Ptidej UI Viewer Standalone::MetricResultsFrame::Lbl_NO_SOLUTION_LABEL",
						new String("Pas de m�trique calcul�e") },
				{ "Ptidej UI Viewer Standalone::MetricResultsFrame::TITLE",
						new String("R�sultats des metriques") },
				{
						"Ptidej UI Viewer Standalone::MetricViewerPanel::Button_COMPUTE_METRICS",
						new String("Calculer les m�triques") },
				{
						"Ptidej UI Viewer Standalone::MetricViewerPanel::Button_SHOW_RESULTS",
						new String("Afficher les r�sultats") },
				{
						"Ptidej UI Viewer Standalone::PercentLayout::IAException_INVALID_CONSTRAINT",
						new String("Contrainte invalide") },
				{
						"Ptidej UI Viewer Standalone::ProjectViewerPanel::ADD_AOL_FILE",
						new String("un fichier AOL") },
				{
						"Ptidej UI Viewer Standalone::ProjectViewerPanel::ADD_AOL_FILE_TEXT",
						new String("Ajouter un fichier AOL (.aol)") },
				{
						"Ptidej UI Viewer Standalone::ProjectViewerPanel::ADD_ASPECTJ_FILE",
						new String("une liste AspectJ") },
				{
						"Ptidej UI Viewer Standalone::ProjectViewerPanel::ADD_ASPECTJ_FILE_TEXT",
						new String("Ajouter une liste AspectJ (.lst)") },
				{
						"Ptidej UI Viewer Standalone::ProjectViewerPanel::ADD_CPP_FILE",
						new String("un fichier C++") },
				{
						"Ptidej UI Viewer Standalone::ProjectViewerPanel::ADD_CPP_FILE_TEXT",
						new String("Ajouter un fichier C++ (.cpp)") },
				{
						"Ptidej UI Viewer Standalone::ProjectViewerPanel::ADD_JAR_FILE",
						new String("un fichier jar") },
				{
						"Ptidej UI Viewer Standalone::ProjectViewerPanel::ADD_JAR_FILE_TEXT",
						new String("Ajouter un fichier JAR (.jar)") },
				{
						"Ptidej UI Viewer Standalone::ProjectViewerPanel::ADD_JAVA_FILE",
						new String("un fichier class") },
				{
						"Ptidej UI Viewer Standalone::ProjectViewerPanel::ADD_JAVA_FILE_TEXT",
						new String("Ajouter un fichier Java (.class)") },
				{
						"Ptidej UI Viewer Standalone::ProjectViewerPanel::ADD_JAVA_SOURCE_FILE",
						new String("un fichier Java") },
				{
						"Ptidej UI Viewer Standalone::ProjectViewerPanel::ADD_JAVA_SOURCE_FILE_TEXT",
						new String("Ajouter un fichier Java (.java)") },
				{
						"Ptidej UI Viewer Standalone::ProjectViewerPanel::CREATE_NEW_PROJECT_TEXT",
						new String("Cr�er un projet Ptidej") },
				{
						"Ptidej UI Viewer Standalone::ProjectViewerPanel::Err_LOAD_ONLY_JAVA_PTIDEJ_PROJECT",
						new String(
							"Chargement de seulement des projet Java de Ptidej.") },
				{
						"Ptidej UI Viewer Standalone::ProjectViewerPanel::Err_UNKNOWN_FILE_TYPE",
						new String("Type de fichier inconnu!") },
				{
						"Ptidej UI Viewer Standalone::ProjectViewerPanel::FILE_DIALOG_ADD_TITLE",
						new String("Choisir {0} � ajouter") },
				{
						"Ptidej UI Viewer Standalone::ProjectViewerPanel::FILE_DIALOG_CHOOSE_PROJECT_FILE",
						new String("Choisir un fichier projet") },
				{
						"Ptidej UI Viewer Standalone::ProjectViewerPanel::FILE_DIALOG_CHOOSE_PROJECT_TITLE",
						new String("Choisir un project � charger") },
				{
						"Ptidej UI Viewer Standalone::ProjectViewerPanel::FILE_DIALOG_EXTRA_DATA_TITLE",
						new String(
							"Choisir des donn�es suppl�mentaires � charger") },
				{
						"Ptidej UI Viewer Standalone::ProjectViewerPanel::FILE_DIALOG_PROJECT_NAME_TITLE",
						new String("Entrez un nom de projet:") },
				{
						"Ptidej UI Viewer Standalone::ProjectViewerPanel::HELP_PADL",
						new String(
							"http://www.iro.umontreal.ca/~ptidej/Publications/Documents/LMO02.doc.pdf") },
				{
						"Ptidej UI Viewer Standalone::ProjectViewerPanel::LOAD_EXTRINSIC_DATA_TEXT",
						new String("Charger des donn�es extrins�ques") },
				{
						"Ptidej UI Viewer Standalone::ProjectViewerPanel::LOAD_PTIDEJ_PROJECT_TEXT",
						new String("Charger un projet Ptidej") },
				{
						"Ptidej UI Viewer Standalone::ProjectViewerPanel::LOADING_TIME",
						new String("Temps de chargement: {0} ms.\n\n") },
				{
						"Ptidej UI Viewer Standalone::ProjectViewerPanel::PROJECT_NAME",
						new String("Nom") },
				{
						"Ptidej UI Viewer Standalone::ProjectViewerPanel::SAVE_PROJECT_TEXT",
						new String("Sauvgarder le projet Ptidej") },
				{
						"Ptidej UI Viewer Standalone::ProjectViewerPanel::STATISTICS",
						new String(
							"\nStatistiques:\n{0}\n              M�moire totale\tM�moire libre\nAvant la construction  {1}\t\t{2}\t\t{3}\nApr�s la construction  {4}\t\t{5}\t\t{6}\nApr�s l\'affichage       {7}\t\t{8}\t\t{9}\n") },
				{
						"Ptidej UI Viewer Standalone::ProjectViewerPanel::TYPE_AOL_NAME",
						new String("AOL") },
				{
						"Ptidej UI Viewer Standalone::ProjectViewerPanel::TYPE_ASPECTJ_NAME",
						new String("AspectJ") },
				{
						"Ptidej UI Viewer Standalone::ProjectViewerPanel::TYPE_CPP_NAME",
						new String("C++") },
				{
						"Ptidej UI Viewer Standalone::ProjectViewerPanel::TYPE_JAVA_NAME",
						new String("Java") },
				{
						"Ptidej UI Viewer Standalone::SolutionConstants::FOLD_UNFOLD",
						new String("Plier/D�plier") },
				{
						"Ptidej UI Viewer Standalone::SolutionConstants::FOLD_UNFOLD_ALL",
						new String("Plier/D�plier tout") },
				{
						"Ptidej UI Viewer Standalone::SolutionConstants::FOLD_UNFOLD_GHOSTS",
						new String("Plier/D�plier le conteneur de font�mes") },
				{
						"Ptidej UI Viewer Standalone::SolutionConstants::FOLD_UNFOLD_OBJECT",
						new String("Plier/D�plier le conteneur d'objets") },
				{ "Ptidej UI Viewer Standalone::SolutionConstants::GO_TO",
						new String("Aller �") },
				{
						"Ptidej UI Viewer Standalone::SolutionConstants::NO_SOLUTION_LABEL",
						new String("Pas de solutions trouv�es") },
				{ "Ptidej UI Viewer Standalone::SolutionConstants::SHOW_HIDE",
						new String("Afficher/Cacher") },
				{
						"Ptidej UI Viewer Standalone::SolutionWindow::Lbl_SOLUTION_LABEL",
						new String(
							"Micro-architecture {0} similaire avec {2} de {1}%") },
				{ "Ptidej UI Viewer Standalone::SolutionWindow::TITLE",
						new String("R�sultats de contraintes") },
				{
						"Ptidej UI Viewer Standalone::SplashProgram::Err_SPLASH_IMG_NOT_FOUND",
						new String("Image de chargement non trouv�e") },
				{
						"Ptidej UI Viewer Standalone::SplashProgram::IMG_SPLASH_FILE_NAME",
						new String("Setup.gif") },
				{ "Ptidej UI Viewer Standalone::ViewerPanel::ABOUT_TEXT",
						new String("About") },
				{
						"Ptidej UI Viewer Standalone::ViewerPanel::AGGREGATION_DISPLAY",
						new String("Affichage des aggregations") },
				{
						"Ptidej UI Viewer Standalone::ViewerPanel::AGGREGATION_NAMES",
						new String("Noms des aggregations") },
				{
						"Ptidej UI Viewer Standalone::ViewerPanel::ASSOCIATION_DISPLAY",
						new String("Affichage des association") },
				{
						"Ptidej UI Viewer Standalone::ViewerPanel::ASSOCIATION_NAMES",
						new String("Noms des associations") },
				{
						"Ptidej UI Viewer Standalone::ViewerPanel::Button_IMAGE_BUTTON",
						new String("� Propos") },
				{
						"Ptidej UI Viewer Standalone::ViewerPanel::COMPOSITION_DISPLAY",
						new String("Affichage des compositions") },
				{
						"Ptidej UI Viewer Standalone::ViewerPanel::COMPOSITION_NAMES",
						new String("Noms des compositions") },
				{
						"Ptidej UI Viewer Standalone::ViewerPanel::CONTAINER_AGGREGATION_DISPLAY",
						new String("Affichage des aggregations conteneuses") },
				{
						"Ptidej UI Viewer Standalone::ViewerPanel::CONTAINER_AGGREGATION_NAMES",
						new String("Noms des aggregations conteneuses") },
				{
						"Ptidej UI Viewer Standalone::ViewerPanel::CONTAINER_COMPOSITION_DISPLAY",
						new String("Affichage des compositions conteneuses") },
				{
						"Ptidej UI Viewer Standalone::ViewerPanel::CONTAINER_COMPOSITION_NAMES",
						new String("Noms des compositions conteneuses") },
				{ "Ptidej UI Viewer Standalone::ViewerPanel::CREATION_DISPLAY",
						new String("Affichage de cr�ation") },
				{ "Ptidej UI Viewer Standalone::ViewerPanel::CREATION_NAMES",
						new String("Noms de cr�ation") },
				{ "Ptidej UI Viewer Standalone::ViewerPanel::EXIT_TEXT",
						new String("Quitter") },
				{ "Ptidej UI Viewer Standalone::ViewerPanel::FIELD_NAMES",
						new String("Noms des champs") },
				{
						"Ptidej UI Viewer Standalone::ViewerPanel::FULLY_QUALIFIED_NAMES",
						new String("Noms complets") },
				{
						"Ptidej UI Viewer Standalone::ViewerPanel::GHOST_ENTITIES_DISPLAY",
						new String("Affichage des entit�s fant�mes") },
				{ "Ptidej UI Viewer Standalone::ViewerPanel::HELP_TEXT",
						new String("Aide") },
				{
						"Ptidej UI Viewer Standalone::ViewerPanel::HIERARCHY_DISPLAY",
						new String("Affichage de la hierarchie") },
				{ "Ptidej UI Viewer Standalone::ViewerPanel::HIERARCHY_NAMES",
						new String("Nom de la hierarchie") },
				{ "Ptidej UI Viewer Standalone::ViewerPanel::METHOD_NAMES",
						new String("Noms de m�thode") },
				{ "Ptidej UI Viewer Standalone::ViewerPanel::NO_PROJECT_TEXT",
						new String("Pas de projet Ptidej") },
				{ "Ptidej UI Viewer Standalone::ViewerPanel::PRINT_TEXT",
						new String("Imprimer") },
				{ "Ptidej UI Viewer Standalone::ViewerPanel::USE_DISPLAY",
						new String("Affichage des utilisations") },
				{ "Ptidej UI Viewer Standalone::ViewerPanel::USE_NAMES",
						new String("Noms des utilisations") },
				{
						"Ptidej UI Viewer Standalone::VisitorViewerPanel::FILE_DIALOG_SAVE_MODEL_TITLE",
						new String("Sauvgarder le mod�le vers...") },

				// *********** Ptidej UI Viewer ***********
				{
						"Ptidej UI Viewer::ProjectData::COPYRIGHT_MESSAGE_R01_C01",
						new String(
							"The Ptidej tool suite is a set of tools to evaluate and to enhance the quality of object-") },
				{
						"Ptidej UI Viewer::ProjectData::COPYRIGHT_MESSAGE_R01_C02",
						new String(
							"oriented programs, promoting the use of patterns, either at the language-, design-, or") },
				{ "Ptidej UI Viewer::ProjectData::COPYRIGHT_MESSAGE_R01_C03",
						new String("architectural-levels.") },
				{
						"Ptidej UI Viewer::ProjectData::COPYRIGHT_MESSAGE_R01_C04",
						new String(
							"The Ptidej tool suite (Pattern Trace Identification, Detection, and Enhancement in Java)") },
				{
						"Ptidej UI Viewer::ProjectData::COPYRIGHT_MESSAGE_R01_C05",
						new String(
							"by Yann-Ga�l Gu�h�neuc uses the PADL meta-model (Pattern and Abstract-level") },
				{
						"Ptidej UI Viewer::ProjectData::COPYRIGHT_MESSAGE_R01_C06",
						new String(
							"Description Language), extension of the PDL meta-model (Pattern Description Language)") },
				{ "Ptidej UI Viewer::ProjectData::COPYRIGHT_MESSAGE_R01_C07",
						new String("by Herv� Albin-Amiot.") },
				{
						"Ptidej UI Viewer::ProjectData::COPYRIGHT_MESSAGE_R01_C08",
						new String(
							"Get more information at www.yann-gael.gueheneuc.net/Work/Research/Ptidej/Demo/.") },
				{
						"Ptidej UI Viewer::ProjectData::COPYRIGHT_MESSAGE_R01_C09",
						new String(
							"Send comments and questions to yann-gael@gueheneuc.net.") },
				{ "Ptidej UI Viewer::ProjectData::COPYRIGHT_MESSAGE_R02_C01",
						new String("Main developpers:") },
				{ "Ptidej UI Viewer::ProjectData::COPYRIGHT_MESSAGE_R02_C02",
						new String("        - Yann-Ga�l Gu�h�neuc") },
				{ "Ptidej UI Viewer::ProjectData::COPYRIGHT_MESSAGE_R02_C03",
						new String("                Universit� de Montr�al") },
				{ "Ptidej UI Viewer::ProjectData::COPYRIGHT_MESSAGE_R02_C04",
						new String("                �cole des Mines de Nantes") },
				{
						"Ptidej UI Viewer::ProjectData::COPYRIGHT_MESSAGE_R02_C05",
						new String(
							"                Object Technology International, Inc.") },
				{ "Ptidej UI Viewer::ProjectData::COPYRIGHT_MESSAGE_R02_C06",
						new String("        - Herv� Albin-Amiot.") },
				{ "Ptidej UI Viewer::ProjectData::COPYRIGHT_MESSAGE_R02_C07",
						new String("                �cole des Mines de Nantes") },
				{ "Ptidej UI Viewer::ProjectData::COPYRIGHT_MESSAGE_R02_C08",
						new String("                Softmaint S.A.") },
				{ "Ptidej UI Viewer::ProjectData::COPYRIGHT_MESSAGE_R02_C10",
						new String("With contributions by:") },
				{ "Ptidej UI Viewer::ProjectData::COPYRIGHT_MESSAGE_R02_C11",
						new String("        - Jean-Yves Guyomarc'h") },
				{
						"Ptidej UI Viewer::ProjectData::COPYRIGHT_MESSAGE_R02_C12",
						new String(
							"                On the Ptidej Solver in Java and metrics") },
				{ "Ptidej UI Viewer::ProjectData::COPYRIGHT_MESSAGE_R02_C13",
						new String("                Graduate, fall 2004") },
				{ "Ptidej UI Viewer::ProjectData::COPYRIGHT_MESSAGE_R02_C14",
						new String("                Universit� de Montr�al.") },
				{
						"Ptidej UI Viewer::ProjectData::COPYRIGHT_MESSAGE_R02_C15",
						new String("        - Lulzim Laloshi and Driton Salihu") },
				{ "Ptidej UI Viewer::ProjectData::COPYRIGHT_MESSAGE_R02_C16",
						new String("                On the Eclipse plug-in") },
				{
						"Ptidej UI Viewer::ProjectData::COPYRIGHT_MESSAGE_R02_C17",
						new String(
							"                Undergraduates, summer 2004") },
				{ "Ptidej UI Viewer::ProjectData::COPYRIGHT_MESSAGE_R02_C18",
						new String("                Universit� de Montr�al.") },
				{
						"Ptidej UI Viewer::ProjectData::COPYRIGHT_MESSAGE_R02_C19",
						new String(
							"        - Ward Flores and S�bastien Robidoux") },
				{
						"Ptidej UI Viewer::ProjectData::COPYRIGHT_MESSAGE_R02_C20",
						new String(
							"                On the C++ creator and PADL") },
				{
						"Ptidej UI Viewer::ProjectData::COPYRIGHT_MESSAGE_R02_C21",
						new String(
							"                Undergraduates, summer 2004") },
				{ "Ptidej UI Viewer::ProjectData::COPYRIGHT_MESSAGE_R02_C22",
						new String("                Universit� de Montr�al.") },
				{
						"Ptidej UI Viewer::ProjectData::COPYRIGHT_MESSAGE_R02_C23",
						new String(
							"        - Salime Bensemmane, Iyadh Sidhom, and Fay�al Skhiri") },
				{
						"Ptidej UI Viewer::ProjectData::COPYRIGHT_MESSAGE_R02_C24",
						new String(
							"                On the Ptidej Solver in Java") },
				{
						"Ptidej UI Viewer::ProjectData::COPYRIGHT_MESSAGE_R02_C25",
						new String(
							"                Undergraduates, summer 2004") },
				{ "Ptidej UI Viewer::ProjectData::COPYRIGHT_MESSAGE_R02_C26",
						new String("                Universit� de Montr�al.") },
				{ "Ptidej UI Viewer::ProjectData::COPYRIGHT_MESSAGE_R02_C27",
						new String("        - Farouk Zaidi") },
				{
						"Ptidej UI Viewer::ProjectData::COPYRIGHT_MESSAGE_R02_C28",
						new String(
							"                On the Java classfile creator and metrics") },
				{ "Ptidej UI Viewer::ProjectData::COPYRIGHT_MESSAGE_R02_C29",
						new String("                Trainee, winter 2004") },
				{
						"Ptidej UI Viewer::ProjectData::COPYRIGHT_MESSAGE_R02_C30",
						new String(
							"                Universit� de technologie Belfort-Montb�liard") },
				{
						"Ptidej UI Viewer::ProjectData::COPYRIGHT_MESSAGE_R02_C31",
						new String(
							"                Centre de Recherche en Informatique de Montr�al") },
				{ "Ptidej UI Viewer::ProjectData::COPYRIGHT_MESSAGE_R02_C32",
						new String("                Universit� de Montr�al.") },
				{
						"Ptidej UI Viewer::ProjectData::COPYRIGHT_MESSAGE_R03_C01",
						new String(
							"The Ptidej tool suite, copyright (c) 2000-2004,") },
				{ "Ptidej UI Viewer::ProjectData::COPYRIGHT_MESSAGE_R03_C02",
						new String("Yann-Ga�l Gu�h�neuc.") },
				{ "Ptidej UI Viewer::ProjectData::COPYRIGHT_MESSAGE_R03_C03",
						new String("All right reserved.") },
				{
						"Ptidej UI Viewer::ProjectData::COPYRIGHT_MESSAGE_R04_C01",
						new String(
							"Use and copying of this software and preparation of derivative works based upon this") },
				{
						"Ptidej UI Viewer::ProjectData::COPYRIGHT_MESSAGE_R04_C02",
						new String(
							"software are permitted. Any copy of this software or of any derivative work must include") },
				{
						"Ptidej UI Viewer::ProjectData::COPYRIGHT_MESSAGE_R04_C03",
						new String(
							"the above copyright notice of the authors, this paragraph and the one after it.") },
				{
						"Ptidej UI Viewer::ProjectData::COPYRIGHT_MESSAGE_R05_C01",
						new String(
							"This software is made available AS IS, and THE AUTHORS DISCLAIM ALL WARRANTIES,") },
				{
						"Ptidej UI Viewer::ProjectData::COPYRIGHT_MESSAGE_R05_C02",
						new String(
							"EXPRESS OR IMPLIED, INCLUDING WITHOUT LIMITATION THE IMPLIED WARRANTIES") },
				{
						"Ptidej UI Viewer::ProjectData::COPYRIGHT_MESSAGE_R05_C03",
						new String(
							"OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE, AND NOT") },
				{
						"Ptidej UI Viewer::ProjectData::COPYRIGHT_MESSAGE_R05_C04",
						new String(
							"WITHSTANDING ANY OTHER PROVISION CONTAINED HEREIN ANY LIABILITY FOR") },
				{
						"Ptidej UI Viewer::ProjectData::COPYRIGHT_MESSAGE_R05_C05",
						new String(
							"DAMAGES RESULTING FROM THE SOFTWARE OR ITS USE IS EXPRESSLY") },
				{
						"Ptidej UI Viewer::ProjectData::COPYRIGHT_MESSAGE_R05_C06",
						new String(
							"DISCLAIMED, WHETHER ARISING IN CONTRACT, TORT (INCLUDING NEGLIGENCE)") },
				{
						"Ptidej UI Viewer::ProjectData::COPYRIGHT_MESSAGE_R05_C07",
						new String(
							"OR STRICT, LIABILITY EVEN IF THE AUTHORS ARE ADVISED OF THE POSSIBILITY") },
				{ "Ptidej UI Viewer::ProjectData::COPYRIGHT_MESSAGE_R05_C08",
						new String("OF SUCH DAMAGES.") },
				{ "Ptidej UI Viewer::ProjectData::PROJECTS_R01",
						new String("CPL v1.0.0") },
				{ "Ptidej UI Viewer::ProjectData::PROJECTS_R02",
						new String("PADL v1.0.0") },
				{ "Ptidej UI Viewer::ProjectData::PROJECTS_R03",
						new String("PADL AOL Creator v1.0.0") },
				{ "Ptidej UI Viewer::ProjectData::PROJECTS_R04",
						new String("PADL C++ Creator v1.0.0") },
				{ "Ptidej UI Viewer::ProjectData::PROJECTS_R05",
						new String("PADL ClassFile Creator v1.0.0") },
				{ "Ptidej UI Viewer::ProjectData::PROJECTS_R06",
						new String("POM v1.0.0") },
				{ "Ptidej UI Viewer::ProjectData::PROJECTS_R07",
						new String("Ptidej v1.0.0") },
				{ "Ptidej UI Viewer::ProjectData::PROJECTS_R08",
						new String("Ptidej Solver 3 v1.0.0") },
				{ "Ptidej UI Viewer::ProjectData::PROJECTS_R09",
						new String("Ptidej Solver 4 v1.0.0") },
				{ "Ptidej UI Viewer::ProjectData::PROJECTS_R10",
						new String("Ptidej UI v1.0.0") },
				{ "Ptidej UI Viewer::ProjectData::PROJECTS_R11",
						new String("Ptidej UI Viewer v1.0.0") },

				// *********** Ptidej UI ***********
				{ "Ptidej UI::Constituent::NAME",
						new String("Une instance de {0}") },
				{
						"Ptidej UI::InheritanceClusterLayout::Err_CALL_getDepth",
						new String(
							"La profondeur de DepthAwareEntity doit �tre calcul�e (computeDepth(Map)) avant l'appel � getDepth().") },
				{
						"Ptidej UI::InheritanceDepthLayout::Err_CALL_getDepth",
						new String(
							"La profondeur de DepthAwareDEntity doit �tre calcul�e (computeDepth(Hashtable)) avant l'appel � getDepth().") },

				// *********** Ptidej ***********
				{
						"Ptidej::SolutionGenerator::UNKNOWN_PROBLEM_TYPE",
						new String(
							"SolutionGenerator: Type de probl�me inconnu.") },
				{
						"Ptidej::SolutionGenerator::UNKNOWN_SOLVER_ALGO",
						new String(
							"SolutionGenerator: Algorithme de solveur inconnu.") },
				{
						"Ptidej::SolutionGenerator::UNKNOWN_SOLVER_VER",
						new String(
							"SolutionGenerator: Version de solveur inconnue.") }

		};

	public Object[][] getContents() {
		return PtidejResourceBundle_fr.CONTENTS;
	}
}
