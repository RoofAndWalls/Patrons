# Patrons
Patrons/Patrick/2023-12-13
Pont
Structurels
Le pont est un patrons qui permet de de séprarer des classes connexes en deux classemeents 
"abstraction et implémentation" qui peuvent évoluer ensemble.
En utilisant le mot-clé "extends" la class AdvancedRemote hérite les fonctions de la class BasicRemote.
Les classes Radio et Device sont des examples d'interfaces. Les interfaces sont comme des modèles qui define les méthode commun pour être utiliser dans les autres classes.
Le polymorphisme c'est quand tu as plusieurs classes relier par l'héritage. Par exemple la class AdvanceRemote hérite les fonctions de BasicRemote. En le faisant on à accès à la fonction "public void mute()" et les fonctions de BasicRemote aussi.
La composition est quand deux objets sont une relation forte(Un ne peut pas être sans l'autre) ex: AdvancedRemote imports et réfère (créé un objet "device") et dépend cette relation.

Crédit: https://refactoring.guru/design-patterns/bridge

### Évaluation

2+ 2-

x CO - Les identifiants (variables et méthodes), les commentaires, les javadoc et l'indentation rendent le code facile à lire (il manque des commentaires explicatifs dans le code)

o CO - Les informations dans le README sont bien structurées et faciles à lire.

x MA - Le diagramme de classe UML est cohérent avec votre implémentation du patron. (les noms dans le diagramme ne correspondent pas aux classes et interfaces dans le projet; l' "abstraction" est une classe dans le diagramme mais une interface dans le code)

x MA - Votre analyse démontre votre capacité à reconnaître les concepts de l'OOP dans un contexte concret. (en fait, c'est relativement bien mais il y a confusion entre héritage et polymorphisme)

o MA - Le travail correspond entièrement aux spécifications du projet.